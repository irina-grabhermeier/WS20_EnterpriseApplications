package at.fhv.igr.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SquareCalculator extends UnicastRemoteObject implements ICalc {

    public SquareCalculator() throws RemoteException {
        super();
    }

    @Override
    public int calc(int num) throws RemoteException {
        return num * num;
    }
}
