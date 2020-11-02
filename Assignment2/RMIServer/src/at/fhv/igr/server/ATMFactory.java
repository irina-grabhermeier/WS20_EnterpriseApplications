package at.fhv.igr.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class ATMFactory extends UnicastRemoteObject implements IATMFactory {

    private static List<Account> accounts;

    protected ATMFactory() throws RemoteException {
    }

    @Override
    public IATMImpl createATM() throws RemoteException {
        return new ATMImpl(this.accounts);
    }

    public static void setAccounts(List<Account> accounts) {
        ATMFactory.accounts = accounts;
    }
}
