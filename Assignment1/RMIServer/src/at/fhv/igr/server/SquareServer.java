package at.fhv.igr.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
import java.rmi.registry.Registry;

public class SquareServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(Registry.REGISTRY_PORT);

            ICalc calculator = new SquareCalculator(); // rmiregistry
            Naming.rebind("calculator", calculator);
            System.out.println("SquareServer is ready.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
