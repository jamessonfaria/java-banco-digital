package interfaces;

import exception.BancoDigitalException;
import model.Conta;

public interface ITransacao {
    public void sacar(double valor) throws BancoDigitalException;
    public void depositar(double valor);
    public void transferir(Conta contaDestino, double valor) throws BancoDigitalException;
    public void extrato();
}
