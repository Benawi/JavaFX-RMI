package AdderRMI;

import java.rmi.*;

public class MyClient {

    public static void main(String args[]) {
        try {

            Adder stub = (Adder) Naming.lookup("rmi://localhost:200/HPPROBOOK");
            System.out.println(stub.add(5, 40));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
