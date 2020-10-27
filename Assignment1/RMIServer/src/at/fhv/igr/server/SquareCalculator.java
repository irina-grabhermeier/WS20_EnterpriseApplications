package at.fhv.igr.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SquareCalculator extends UnicastRemoteObject implements ICalc {

    protected SquareCalculator() throws RemoteException {

    }

    @Override
    public int calc(int num) throws RemoteException {
        return num * num;
    }
}
