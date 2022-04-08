import java.util.ArrayList;
import java.util.List;

public class transacciones {
    List<MovimientosFinancieros> movimientsFinancial;

    public transacciones() {
        this.movimientsFinancial = new ArrayList<>();
    }

    public void agregarTransaccion(MovimientosFinancieros financial) {
        this.movimientsFinancial.add(financial);
    }

    public List<MovimientosFinancieros> listarTransacciones() {
        return this.movimientsFinancial;
    }
}
