import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.rmi.*;

public class MyClientCont {
    @FXML
    private TextField hostname;
    @FXML
    private ComboBox port;

    public  void handle() {
        try {

            Adder stub = (Adder) Naming.lookup("rmi://localhost:200/HPPROBOOK");
            System.out.println(stub.add(5, 40));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
