package com.example.selectors;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class RegisterSelector {
    @FXML 
    protected VBox nameContainer;

    @FXML
    protected TextField name;

    @FXML
    protected Label nameValidation;

    @FXML 
    protected TextField lastname;

    @FXML
    protected Label lastnameValidation;

    @FXML
    protected TextField email;

    @FXML
    protected Label emailValidation;

    @FXML
    protected PasswordField password;

    @FXML
    protected Label passwordValidation;

    @FXML
    protected CheckBox checkbox;

    @FXML
    protected Button button;

    @FXML
    protected Hyperlink switchToLogin;
    
}
