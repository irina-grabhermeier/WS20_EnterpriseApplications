package at.fhv.igr.server;

public interface IATMImpl {
    void deposit(int accountNo, float amount);

    void withdraw(int accountNo, float amount);

    float getBalance(int accountNo);
}
