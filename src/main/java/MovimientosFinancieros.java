import ValueObject.Fecha;


public class MovimientosFinancieros {
    private double credito;
    private double debito;
    private double saldo;
    private Fecha fecha;

    public MovimientosFinancieros() {}

    public MovimientosFinancieros(double credito, double debito, double saldo, Fecha fecha) {
        this.credito = credito;
        this.debito = debito;
        this.saldo = saldo;
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "MovimientosFinancieros{" +
                "credito=" + credito +
                ", debito=" + debito +
                ", saldo=" + saldo +
                ", fecha=" + fecha.getFecha() +
                '}';
    }
}
