package AdderRMI;

import java.rmi.*;

public class MyServer {

    public static void main(String args[]) {
        try {

            Adder stub = new AdderRemote();
            Naming.rebind("rmi://10.194.121.82:200/HPPROBOOK",stub);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
