package at.fhv.igr.server;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IATMFactory extends Remote, Serializable {
    IATMImpl createATM() throws RemoteException;
}
