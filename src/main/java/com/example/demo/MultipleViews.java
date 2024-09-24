package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        BorderPane firstViewLayout = new BorderPane();
        Button toSecondViewButton = new Button("To the second view!");
        firstViewLayout.setTop(new Label("First view!"));
        firstViewLayout.setCenter(toSecondViewButton);

        Scene firstScene = new Scene(firstViewLayout);

        VBox secondViewLayout = new VBox();
        Button toThirdViewButton = new Button("To the third view!");
        Label secondViewLabel = new Label("Second view!");
        secondViewLayout.getChildren().addAll(toThirdViewButton, secondViewLabel);

        Scene secondScene = new Scene(secondViewLayout);

        GridPane thirdViewLayout = new GridPane();
        Label thirdViewLabel = new Label("Third view!");
        Button toFirstViewButton = new Button("To the first view!");
        thirdViewLayout.add(thirdViewLabel, 0, 0);
        thirdViewLayout.add(toFirstViewButton, 1, 1);

        Scene thirdScene = new Scene(thirdViewLayout);

        toSecondViewButton.setOnAction(event -> window.setScene(secondScene));
        toThirdViewButton.setOnAction(event -> window.setScene(thirdScene));
        toFirstViewButton.setOnAction(event -> window.setScene(firstScene));

        window.setScene(firstScene);
        window.setTitle("Multiple Views");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
