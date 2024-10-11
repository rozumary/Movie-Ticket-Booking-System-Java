package com.mycompany.movieticketbookingsystemjava;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField signIn_username;

    @FXML
    private PasswordField signIn_password;

    @FXML
    private Hyperlink signIn_createAccount;

    @FXML
    public void btn_loginActionperformed(ActionEvent event) {
        String username = "group5";
        String password = "12345";
        
        String user_name = signIn_username.getText();
        String pass = signIn_password.getText();
        
        if (user_name.equals(username) && pass.equals(password)) {
            Alert a = new Alert(Alert.AlertType.INFORMATION, "Login Successful", ButtonType.OK);
            a.show();
        } else {
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setContentText("Username and Password are incorrect.");
            a.show();
        }
    
        System.out.println("Login button clicked");
    }

    @FXML
    public void switchToSecondary(ActionEvent event) throws IOException {
        App.setRoot("secondary");
    }
}
