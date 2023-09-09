package com.example.validation;

import com.example.selectors.RegisterSelector;

import javafx.scene.control.Label;

public class Validation extends RegisterSelector {

    private int textLength;
    private int minLength;
    private int maxLength;
    private Label label;

    private static Validation validation = new Validation();

    public static Validation validate(String textLength) {
        validation.textLength = textLength.length();
        return validation;
    }

    public Validation label(Label label) {
        this.label = label;
        return this;
    }

    public Validation minLength(int minLength) {
        this.minLength = minLength;
        return this;
        
    }
    
    public Validation maxLength(int maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    public boolean check() {

        if (textLength < minLength) {
            this.label.setText("El campo debe contener al menos " + this.minLength + " carácteres.");
            this.label.setVisible(true);
            return false;
        }

        if (textLength > maxLength) {
            this.label.setText("El campo no debe superar los" + this.maxLength + " carácteres.");
            this.label.setVisible(true);
            return false;
        }

        this.label.setVisible(false);
        return true;
    }

}
