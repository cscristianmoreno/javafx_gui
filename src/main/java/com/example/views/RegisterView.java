package com.example.views;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegisterView {

    public RegisterView(Stage stage) throws IOException {
        FXMLLoader root;
        
        root = new FXMLLoader(getClass().getResource("/views/register.fxml"));

        Scene scene = new Scene(root.load());
        stage.setScene(scene);
        stage.setResizable(false);

        stage.show();
    }
}
