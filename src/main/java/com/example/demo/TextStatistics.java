package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Arrays;

public class TextStatistics extends Application {

    private Label label1;
    private Label label2;
    private Label label3;

    @Override
    public void start(Stage window) {
        HBox hbox = new HBox();
        hbox.setSpacing(10);

        TextArea textArea = new TextArea();
        BorderPane layout = new BorderPane();
        layout.setCenter(textArea);
        layout.setBottom(hbox);

        label1 = new Label("Letters: 0");
        label2 = new Label("Words: 0");
        label3 = new Label("Longest: None");

        hbox.getChildren().addAll(label1, label2, label3);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.trim().split("\\s+");

            int words = (newValue.trim().isEmpty()) ? 0 : parts.length;

            String longest = (words > 0) ? Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .orElse("") : "";

            // Update label texts
            label1.setText("Letters: " + characters);
            label2.setText("Words: " + words);
            label3.setText("Longest: " + longest);
        });

        Scene view = new Scene(layout, 400, 300);

        window.setTitle("Text Statistics");
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatistics.class);
    }
}
