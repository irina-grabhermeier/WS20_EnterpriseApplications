package at.fhv.igr.server;

import java.rmi.RemoteException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ATMImpl implements IATMImpl {

    private static List<Account> accounts;

    public ATMImpl(List<Account> accounts) {
        ATMImpl.accounts = accounts;
    }

    public static void setAccounts(List<Account> accounts) {
        ATMImpl.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    @Override
    public void deposit(int accountNo, float amount) throws RemoteException {
        AtomicBoolean accountFound = new AtomicBoolean(false);

        ATMImpl.accounts.forEach(account -> {
            if (account.getAccountNumber() == accountNo) {
                account.addToBalance(amount);
                accountFound.set(true);
                return;
            }
        });

        if (!accountFound.get()) {
            throw new IllegalArgumentException("Account with account number " + accountNo + " des not exist,");
        }
    }

    @Override
    public void withdraw(int accountNo, float amount) throws RemoteException {

        AtomicBoolean accountFound = new AtomicBoolean(false);

        ATMImpl.accounts.forEach(account -> {
            if (account.getAccountNumber() == accountNo) {
                account.removeFromBalance(amount);
                accountFound.set(true);
                return;
            }
        });

        if (!accountFound.get()) {
            throw new IllegalArgumentException("Account with account number " + accountNo + " des not exist,");
        }
    }

    @Override
    public float getBalance(int accountNo) throws RemoteException {
        for (Account a : ATMImpl.accounts) {
            if (a.getAccountNumber() == accountNo) {
                return a.getBalance();
            }
        }
        throw new IllegalArgumentException("Account with account number " + accountNo + " des not exist,");
    }
}
