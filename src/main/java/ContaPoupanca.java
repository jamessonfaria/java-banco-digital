public class ContaPoupanca extends Conta{
    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }

    @Override
    public void extrato() {
        System.out.println("----------Extrato Conta Poupança------");
        detalheConta();
    }
}
