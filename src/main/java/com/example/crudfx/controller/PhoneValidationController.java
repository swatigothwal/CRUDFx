package com.example.crudfx.controller;

import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

public class PhoneValidationController implements javafx.beans.value.ChangeListener<String> {


    private int maxLength;
    private TextField phone;


    public PhoneValidationController(TextField phone, int maxLength) {
        this.phone= phone;
        this.maxLength = maxLength;
    }


    public int getMaxLength() {
        return maxLength;
    }


    @Override
    public void changed(ObservableValue<? extends String> ov, String oldValue,
            String newValue) {


        if (newValue == null) {
            return;
        }


        if (newValue.length() > maxLength) {
        	phone.setText(oldValue);
        } else {
        	phone.setText(newValue);
        }
    }


}// End of Class