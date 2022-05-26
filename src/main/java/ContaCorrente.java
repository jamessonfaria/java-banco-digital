public class ContaCorrente extends Conta {

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }

    @Override
    public void extrato() {
        System.out.println("----------Extrato Conta Corrente------");
        detalheConta();
    }
}
