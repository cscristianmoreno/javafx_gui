package com.example;

import com.example.manager.Manager;
import com.example.views.RegisterView;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        new Manager();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        new RegisterView(stage);
    }
}