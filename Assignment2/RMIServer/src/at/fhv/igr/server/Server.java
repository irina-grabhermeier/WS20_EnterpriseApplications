package at.fhv.igr.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Server {

    private static List<Account> accounts = new ArrayList<>(Arrays.asList(
            new Account(1, 0),
            new Account(2, 100),
            new Account(3, 500)
    ));

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

            IATMFactory factory = new ATMFactory(); // rmiregistry
            ATMFactory.setAccounts(accounts);
            Naming.rebind("atmfactory", factory);
            System.out.println("ATM Server is ready.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
