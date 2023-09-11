package com.example.selectors;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class LoginSelector {
    
    @FXML
    protected TextField email;

    @FXML
    protected PasswordField password;
    
    @FXML
    protected CheckBox checkbox;

    @FXML
    protected VBox alert;

    @FXML
    protected Hyperlink switchToRegister;
}
