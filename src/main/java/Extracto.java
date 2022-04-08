import ValueObject.Fecha;

import java.util.List;

public class Extracto {
    private final Balance balance;
    private transacciones movimientosFinancieros;

        public Extracto() {
        this.balance = new Balance();
        this.movimientosFinancieros = new transacciones();
    }

    public Extracto(Balance balance) {
        this.balance = balance;
    }

    public void hacerDeposito(double amount, String date) {
        this.balance.incrementarBalance(amount);
        this.movimientosFinancieros
                .agregarTransaccion(
                        new MovimientosFinancieros(amount, 0, this.balance.getBalance(), new Fecha(date))
                );
    }

    public void hacerRetiro(double amount, String date) {
        this.balance.debitarBalance(amount);
        this.movimientosFinancieros
                .agregarTransaccion(
                        new MovimientosFinancieros(0,amount,  this.balance.getBalance(), new Fecha(date))
                );
    }

    public List<MovimientosFinancieros> listaMovimientosFinancieros() {
        return this.movimientosFinancieros.listarTransacciones();
    }
}
