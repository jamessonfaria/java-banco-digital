public class Start {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        cc.extrato();

        Conta cp = new ContaPoupanca();
        cp.extrato();

        cc.depositar(1000.0);
        cc.extrato();

        cc.transferir(cp, 200.0);
        cc.extrato();
        cp.extrato();

    }

}
