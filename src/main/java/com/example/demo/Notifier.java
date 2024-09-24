package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Notifier extends Application {

    @Override
    public void start(Stage window) {
        VBox vbox = new VBox();
        vbox.setSpacing(10);

        BorderPane layout = new BorderPane();
        layout.setCenter(vbox);
        TextField tf = new TextField();
        Button btn = new Button("Update");
        Label lbl = new Label();

        btn.setOnAction(e -> {
            lbl.setText(tf.getText());
        });

        vbox.getChildren().addAll(tf,btn,lbl);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(Notifier.class);
    }
}
