public class ContaCorrente extends Conta {
    private double limite;

    @Override
    public boolean sacar(double valor) {
        if(super.getSaldo() + limite > 0 ){

        }
        return false;
    }
}
