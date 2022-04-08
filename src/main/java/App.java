import static function.Utils.amountOf;
import static function.Utils.date;

public class App {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(new Extracto());

        cuenta.depositar(amountOf(1000), date("10/01/2021"));
        cuenta.retirar(amountOf(500), date("05/03/2021"));
        cuenta.depositar(amountOf(100), date("31/08/2021"));
        cuenta.imprimirDeclaraciones();
    }
}
