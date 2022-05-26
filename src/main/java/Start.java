import exception.BancoDigitalException;
import model.*;

import java.util.ArrayList;

public class Start {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jamesson");
        Cliente cliente2 = new Cliente("Carlos Tenorio");

        Conta cc = new ContaCorrente(cliente);
        cc.extrato();

        Conta cp = new ContaPoupanca(cliente);
        cp.extrato();

        Conta ccc = new ContaCorrente(cliente2);

        Banco banco = new Banco("Bradesco", new ArrayList<Conta>(){{
            add(cc);
            add(cp);
            add(ccc);
        }});

        try{
            ccc.depositar(500.0);
            ccc.extrato();

            cc.depositar(1000.0);
            cc.extrato();

            cc.transferir(cp, 200.0);
            cc.extrato();
            cp.extrato();

            banco.listaContas();

            cp.sacar(1000);

        }catch (BancoDigitalException e){
            System.err.println(e.getMessage());
        }

    }

}
