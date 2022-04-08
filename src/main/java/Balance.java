
public class Balance {
    private double balance;

    public Balance() {
    }

    public Balance(double balance) {
        this.balance = balance;
    }

    public void incrementarBalance(double credit) {
        this.balance = balance + credit;
    }

    public void debitarBalance(double debit) {
        this.balance = balance - debit;
    }

    public double getBalance() {
        return this.balance;
    }
}
