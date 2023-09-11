package com.example.utils;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.util.Duration;

public class Animations {

    public  void setFadeIn(Node node) {
        FadeTransition fadeTransition;
        
        fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(300));
        fadeTransition.setNode(node);
        fadeTransition.setToValue(1);
        
        fadeTransition.play();
    } 
}
