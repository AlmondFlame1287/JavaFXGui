package com.gui;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SecondaryCntrl {
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void getText() {
        System.out.println(usernameField.getText());
    }

    @FXML
    private void getPassword() {
        System.out.println(passwordField.getText());
    }
}
