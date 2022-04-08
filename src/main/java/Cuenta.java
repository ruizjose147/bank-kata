import ValueObject.CuentaId;

public class Cuenta {
    private final CuentaId cuentaId;
    private final Extracto extracto;

    public Cuenta(Extracto extracto) {
        this.cuentaId = new CuentaId();
        this.extracto = extracto;
    }

    void depositar(double amount, String date) {
        this.extracto.hacerDeposito(amount, date);

    }

    void retirar(double amount, String date){
        this.extracto.hacerRetiro(amount, date);

    }

    void imprimirDeclaraciones() {
        this.extracto.listaMovimientosFinancieros().forEach(m -> System.out.println(m.toString()));
    }

}
