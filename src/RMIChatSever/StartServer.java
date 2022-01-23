package RMIChatSever;

import java.rmi.*;

public class StartServer {

    public static void main(String[] args) {
        try {
            //System.setSecurityManager(new RMISecurityManager());
            //java.rmi.registry.LocateRegistry.createRegistry(5000);

            ChatServerInt b = new ChatServer();
            Naming.rebind("rmi://localhost/myabc", b);
            System.out.println("[System] Chat Server is ready.");
        } catch (Exception e) {
            System.out.println("Chat Server failed: " + e);
        }
    }
}
