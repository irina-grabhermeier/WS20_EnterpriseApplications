package at.fhv.igr.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalc extends Remote {
    int calc(int num) throws RemoteException;
}
