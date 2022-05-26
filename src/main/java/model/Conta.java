package model;

import exception.BancoDigitalException;
import interfaces.ITransacao;
import lombok.Getter;

@Getter
public abstract class Conta implements ITransacao {
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
        this.cliente = cliente;
        this.saldo = 0.0;
        SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) throws BancoDigitalException {
        if (valor > this.saldo)
            throw new BancoDigitalException(String.format(
                    "Cliente: %s | Conta: %d | Valor: %f - Saldo insuficiente...",
                    this.cliente.getNome(), this.numero, valor));

        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) throws BancoDigitalException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void detalheConta() {
        System.out.println(String.format("Cliente: %s / Agencia: %d / Conta: %d / Saldo: %f",
                this.cliente.getNome(), this.agencia, this.numero, this.saldo));
        System.out.println("--------------------------------------");
    }

}
