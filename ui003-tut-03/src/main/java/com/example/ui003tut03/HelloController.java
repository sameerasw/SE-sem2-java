package com.example.ui003tut03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private Button clrButton;

    @FXML
    private TextField firstNumber;

    @FXML
    private TextField secondNumber;

    @FXML
    private Button sumButton;

    @FXML
    private Label sumLabel;

    @FXML
    void clrButtonClick(ActionEvent event) {
        firstNumber.clear();
        secondNumber.clear();
        sumLabel.setText("Sum: ");
    }

    @FXML
    void sumButtonClick(ActionEvent event) {
        int num1 = Integer.parseInt(firstNumber.getText());
        int num2 = Integer.parseInt(secondNumber.getText());
        int sum = num1 + num2;
        sumLabel.setText("Sum: " + sum);
    }

}
