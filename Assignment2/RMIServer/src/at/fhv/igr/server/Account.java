package at.fhv.igr.server;

public class Account {

    private int accountNumber;
    private float balance;

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public Account(int accountNumber, float initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    protected void setBalance(float balance) {
        this.balance = balance;
    }

    protected float getBalance() {
        return this.balance;
    }

    protected void addToBalance(double amount) {
        this.balance += amount;
    }

    protected void removeFromBalance(double amount) {
        this.balance -= amount;
    }
}
