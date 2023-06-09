package com.example.ui004tut;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private TextField first;

    @FXML
    private TextField last;

    @FXML
    private Text output;

    @FXML
    private Button submit;

    @FXML
    private TextField title;

    @FXML
    void onSubmit(ActionEvent event) {
        output.setText(title.getText() + " " + first.getText() + " " + last.getText());
    }

}
