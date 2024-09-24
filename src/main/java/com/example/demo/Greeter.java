package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Greeter extends Application {
    @Override
    public void start(Stage window) {
        BorderPane firstViewLayout = new BorderPane();
        TextField nameInput = new TextField();
        Button startButton = new Button("Start");

        firstViewLayout.setTop(new Label("Enter your name and start:"));
        firstViewLayout.setCenter(nameInput);
        firstViewLayout.setBottom(startButton);

        Scene firstScene = new Scene(firstViewLayout, 300, 200);

        BorderPane secondViewLayout = new BorderPane();
        Label greetingLabel = new Label();


        secondViewLayout.setCenter(greetingLabel);

        Scene secondScene = new Scene(secondViewLayout, 300, 200);

        startButton.setOnAction(event -> {
            String name = nameInput.getText();
            greetingLabel.setText("Welcome " + name + "!");
            window.setScene(secondScene);
        });

        window.setScene(firstScene);
        window.setTitle("Greeter Application");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
