public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) throw new IllegalArgumentException("Saldo awal tidak boleh negatif");
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount tidak boleh negatif");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Amount tidak boleh negatif");
        if (amount > balance) throw new IllegalArgumentException("Saldo tidak cukup");
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
