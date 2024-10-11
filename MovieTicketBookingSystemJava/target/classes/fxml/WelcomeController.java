package fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;

public class WelcomeController implements Initializable {

    @FXML
    private Label welcomeMessage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    public void setUsername(String username) {
        welcomeMessage.setText("Welcome, " + username + "!");
        
    }
}
