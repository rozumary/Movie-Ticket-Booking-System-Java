package com.mycompany.movieticketbookingsystemjava;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class SecondaryController {

     @FXML
    private Hyperlink signUp_alreadyHaveAccount;

    @FXML
    private TextField signUp_email;

    @FXML
    private VBox signUp_form;

    @FXML
    private Button signUp_loginbtn;

    @FXML
    private PasswordField signUp_password;

    @FXML
    private TextField signUp_username;
    
    @FXML
    public void switchToPrimary(ActionEvent event) throws IOException {
        App.setRoot("primary"); 
    }
}