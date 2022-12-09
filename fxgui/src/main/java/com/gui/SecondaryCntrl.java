package com.gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SecondaryCntrl {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Text errorStatus;

    @FXML
    private void getText() {
        System.out.println(usernameField.getText());
    }

    private boolean checkPassword() {
        return (passwordField.getText().equals("1234") && usernameField.getText().equals("Mike"));
    }

    @FXML
    private void goToApp() {
        if (!checkPassword()) {
            errorStatus.setText("Password o username errati");
            return;
        }

        try {
            App.setRoot("application");
        } catch (IOException ie) {
            System.out.println("Errore nell'accesso all'app");
            ie.printStackTrace();
        }
    }
}
