import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.rmi.Naming;

public class MyClientCont {
    @FXML
    private TextField hostname;
    @FXML
    private TextField num1;
    @FXML
    private TextField port;
    @FXML
    private ComboBox num2;

    public void handle() {
        try {
            int x = Integer.parseInt(num1.getText());
            int y = Integer.parseInt(num2.getValue().toString());
            Adder stub = (Adder) Naming.lookup("rmi://" + hostname.getText() + ":" + port.getText() + "/HPPROBOOK");
            System.out.println(stub.add(x, y));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
