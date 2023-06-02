package com.example.ui003tut;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Scanner;

public class HelloController {

    @FXML
    private TextField nameField;

    @FXML
    private Button clearButton;

    @FXML
    protected void onClearButtonClick(ActionEvent event) {
        nameField.clear();
    }

    @FXML
    private Button scan;

    @FXML
    void onScanClick(ActionEvent event) {
        String name = scanLogStr();
        welcomeText.setText("Hello " + name + "!");
    }

    @FXML
    private Button scanLog;

    @FXML
    void onScanLogClick(ActionEvent event) {
        String name = scanLogStr();
        System.out.println("Hello " + name + "!");
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        welcomeText.setText("Hello " + nameField.getText() + "!");
    }

    private static String scanLogStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        return name;
    }
}