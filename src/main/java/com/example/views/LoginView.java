package com.example.views;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginView {
    public LoginView(Stage stage) throws IOException {
        
        FXMLLoader root = new FXMLLoader(getClass().getResource("/views/login.fxml"));

        Scene scene = new Scene(root.load());

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
