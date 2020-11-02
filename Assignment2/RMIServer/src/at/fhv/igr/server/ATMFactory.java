package at.fhv.igr.server;

import java.rmi.RemoteException;
import java.util.List;

public class ATMFactory implements IATMFactory {

    private static List<Account> accounts;

    @Override
    public IATMImpl createATM() throws RemoteException {
        return new ATMImpl(this.accounts);
    }

    public static void setAccounts(List<Account> accounts) {
        ATMFactory.accounts = accounts;
    }
}
