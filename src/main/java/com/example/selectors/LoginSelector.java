package com.example.selectors;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginSelector {
    
    @FXML
    protected TextField email;

    @FXML
    protected PasswordField password;
    
    @FXML
    protected CheckBox checkbox;

    @FXML
    protected Hyperlink switchToRegister;
}
