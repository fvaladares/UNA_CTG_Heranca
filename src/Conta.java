public class Conta {
    // Atributos da classe Conta
    private int numeroConta;
    private String titular;
    private double saldo;

    public Conta(int numeroConta,
                 String titular,
                 double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Conta() {
        this.numeroConta = 0;
        this.titular = null;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public String toString() {
        return "Conta{" +
                "numeroConta=" + numeroConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public boolean sacar(double valor, double limite) {
        if (this.saldo + limite - valor > 0) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean sacar(double valor) {
        return sacar(valor, 0);
    }

}
