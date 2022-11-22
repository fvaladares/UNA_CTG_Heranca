public class ContaCorrente extends Conta {
    private double limite;

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor, this.limite);
    }

    @Override
    public double getSaldo() {
        return super.getSaldo() + limite;
    }
}
