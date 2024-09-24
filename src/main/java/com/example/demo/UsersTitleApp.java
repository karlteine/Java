package com.example.demo;

import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;

public class UsersTitleApp extends Application {
    private static String title = "Default Title";

    public static void setTitle(String newTitle) {
        title = newTitle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title for the application: ");
        String inputTitle = scanner.nextLine();

        setTitle(inputTitle);

        launch(args);
    }

    @Override
    public void start(Stage window) {
        window.setTitle(title);
        window.show();
    }
}
