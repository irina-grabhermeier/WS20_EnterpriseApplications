package at.fhv.igr.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IATMImpl extends Remote {
    void deposit(int accountNo, float amount) throws RemoteException;

    void withdraw(int accountNo, float amount) throws RemoteException;

    float getBalance(int accountNo) throws RemoteException;
}
