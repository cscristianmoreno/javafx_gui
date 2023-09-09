package com.example.controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ViewController {
    private FXMLLoader root;
    private Stage stage;
    private Scene scene;

    public void switchToRegister(ActionEvent event) throws IOException {
        root = new FXMLLoader(getClass().getResource("/views/register.fxml"));

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        scene = new Scene(root.load());
        stage.setScene(scene);
        stage.show();
    }

    public void switchToLogin(ActionEvent event) throws IOException {
        root = new FXMLLoader(getClass().getResource("/views/login.fxml"));

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        scene = new Scene(root.load());
        stage.setScene(scene);
        stage.show();
    }
}
