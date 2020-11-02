package at.fhv.igr.client;
import at.fhv.igr.server.ICalc;

import java.rmi.Naming;

public class SquareClient {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt(args[0]);
            ICalc calculator = (ICalc) Naming.lookup("//localhost/calculator");
            System.out.println(calculator.calc(num));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
