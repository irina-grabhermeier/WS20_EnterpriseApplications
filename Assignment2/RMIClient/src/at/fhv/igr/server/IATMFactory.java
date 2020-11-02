package at.fhv.igr.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IATMFactory extends Remote {
    IATMImpl createATM() throws RemoteException;
}
