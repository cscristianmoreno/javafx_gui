package com.example.controllers;

import java.io.IOException;

import com.example.models.Users;
import com.example.repository.UserRepositoryImpl;
import com.example.selectors.LoginSelector;
import com.example.utils.HashPassword;

import javafx.event.ActionEvent;

public class LoginController extends LoginSelector {
    
    public void handleLogin() {
        UserRepositoryImpl repository = new UserRepositoryImpl();

        String userEmail = email.getText();

        Users user = repository.findByEmail(userEmail);

        if (user != null) {
            String fieldPassword = password.getText();
            String hashedPassword = user.getPassword();

            boolean passwordSuccess = HashPassword.compareSecurePassword(fieldPassword, hashedPassword);

            if (passwordSuccess) {

                if (checkbox.isSelected()) {
                    user.setAuto(true);
                }
                else {
                    user.setAuto(false);
                }

                UserRepositoryImpl userRepositoryImpl = new UserRepositoryImpl();
                userRepositoryImpl.save(user);
            }
            else {
                System.out.println("Los datos son incorrectos");
            }
        }
    }

    public void switchToRegister(ActionEvent event) throws IOException {
        ViewController viewController = new ViewController();
        viewController.switchToRegister(event);
    }
}
