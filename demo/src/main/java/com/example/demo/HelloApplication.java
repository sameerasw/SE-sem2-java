package com.example.demo;

import java.io.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HelloApplication extends Application{

    public static void main(String[] args){
        launch();
    }

    public void start(Stage primaryStage) throws Exception {
        Button bt1 = new Button("Click Me"); //control
        HBox h = new HBox(); //layout
        h.getChildren().add(bt1); //adding control to layout
        Scene sc = new Scene(h); //creating scene and adding layout to scene
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}