package com.example.controllers;

import java.io.IOException;

import com.example.models.Users;
import com.example.repository.UserRepositoryImpl;
import com.example.selectors.RegisterSelector;
import com.example.utils.HashPassword;
import com.example.validation.Validation;

import javafx.event.ActionEvent;

public class RegisterController extends RegisterSelector {

    private boolean fieldName;
    private boolean fieldLastname;
    private boolean fieldEmail;
    private boolean fieldPassword;
    
    public boolean handleRegister() {
        if (!fieldName || !fieldLastname || !fieldEmail || !fieldPassword || !checkbox.isSelected()) {
            return false;
        }

        String hashPassword = HashPassword.createSecurePassword(password.getText());
        Users users = new Users();
        
        users.setName(name.getText());
        users.setLastname(lastname.getText());
        users.setEmail(email.getText());
        users.setPassword(hashPassword);

        UserRepositoryImpl userRepositoryImpl = new UserRepositoryImpl(); 
        userRepositoryImpl.save(users);

        System.out.println("Te has registrado con exito");
        System.out.printf("\nEmail: %s\nContraseña: %s", users.getEmail(), hashPassword);
        return true;
    }

    public void handleKeyTypedNameField() {
        fieldName  = Validation.validate(name.getText()).label(nameValidation).minLength(3).maxLength(10).check();
    }

    public void handleKeyTypedLastNameField() {
        fieldLastname = Validation.validate(lastname.getText()).label(lastnameValidation).minLength(3).maxLength(10).check();
    }

    public void handleKeyTypedEmailField() {
        fieldEmail = Validation.validate(email.getText()).label(emailValidation).minLength(3).maxLength(30).check();
    }

    public void handleKeyTypedPasswordField() {
        fieldPassword = Validation.validate(password.getText()).label(passwordValidation).minLength(3).maxLength(10).check();
    }
    
    public void switchToLogin(ActionEvent event) throws IOException {
        ViewController viewController = new ViewController();
        viewController.switchToLogin(event);
    }
}
