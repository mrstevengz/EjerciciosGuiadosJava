public class CuentaBancaria {
    String titular;
    private double saldo;
    private double cantidad;

    public CuentaBancaria(double saldoinicial) {
        this.saldo = saldoinicial;
    }

    public void deposit(double cantidad) {
        this.saldo += cantidad;
        System.out.println("Cantidad: " + cantidad + " depositada con exito");
    }

    public void withdraw(double cantidad) {
        this.saldo -= cantidad;
        System.out.println("Cantidad: " + cantidad + "  retirada con exito");
    }

    public double getSaldo() {
        return this.saldo;
    }

}
