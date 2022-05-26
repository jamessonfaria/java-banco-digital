package model;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extrato() {
        System.out.println("----------Extrato model.Conta Poupança------");
        detalheConta();
    }
}
