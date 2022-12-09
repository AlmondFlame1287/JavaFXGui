package com.gui;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryCntrl {

    @FXML
    private void showLogin() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void showRegister() throws IOException {
        App.setRoot(null);
    }
}