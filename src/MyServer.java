import java.rmi.*;

public class MyServer {

    public static void main(String args[]) {
        try {

            Adder stub = new AdderRemote();
            Naming.rebind("rmi://localhost:200/HPPROBOOK",stub);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
