package RMIChatClient;

import RMIChatClient.ChatUI;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import RMIChatClient.ChatClientInt;

public class ChatClient extends UnicastRemoteObject implements ChatClientInt {

    private String name;
    private ChatUI ui;

    public ChatClient(String n) throws RemoteException {
        name = n;
    }

    @Override
    public void tell(String st) throws RemoteException {
        System.out.println(st);
        ui.writeMsg(st);
    }

    @Override
    public String getName() throws RemoteException {
        return name;
    }

    public void setGUI(ChatUI t) {
        ui = t;
    }
}
