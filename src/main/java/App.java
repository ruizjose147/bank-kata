import static function.Utils.amountOf;
import static function.Utils.date;

public class App {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(new Extracto());

        cuenta.depositar(amountOf(2000000), date("07/04/2022"));
        cuenta.retirar(amountOf(500000), date("06/04/2022"));
        cuenta.depositar(amountOf(300000), date("30/03/2022"));
        cuenta.imprimirDeclaraciones();
    }
}
