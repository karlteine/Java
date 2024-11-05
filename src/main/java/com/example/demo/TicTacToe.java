package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    private String currentPlayer = "X";
    private Button[][] buttons = new Button[3][3];
    private Label turnLabel;

    @Override
    public void start(Stage window) {
        GridPane layout = new GridPane();
        turnLabel = new Label("Turn: " + currentPlayer);
        turnLabel.setFont(Font.font("Monospaced", 40));
        layout.add(turnLabel, 0, 0, 3, 1);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                buttons[x][y] = new Button("");
                buttons[x][y].setFont(Font.font("Monospaced", 40));
                buttons[x][y].setPrefSize(100, 100);
                int finalX = x;
                int finalY = y;

                buttons[x][y].setOnAction(event -> handleButtonClick(finalX, finalY));
                layout.add(buttons[x][y], x, y + 1);
            }
        }

        Scene view = new Scene(layout, 300, 400);
        window.setScene(view);
        window.setTitle("Tic Tac Toe");
        window.show();
    }

    private void handleButtonClick(int x, int y) {
        if (buttons[x][y].getText().equals("")) {
            buttons[x][y].setText(currentPlayer);
            if (checkForWin()) {
                turnLabel.setText(currentPlayer + " wins!");
                disableButtons();
            } else if (checkForDraw()) {
                turnLabel.setText("It's a draw!");
            } else {
                currentPlayer = currentPlayer.equals("X") ? "O" : "X";
                turnLabel.setText("Turn: " + currentPlayer);
            }
        }
    }

    private boolean checkForWin() {
        for (int i = 0; i < 3; i++) {
            if ((buttons[i][0].getText().equals(currentPlayer) && buttons[i][1].getText().equals(currentPlayer) && buttons[i][2].getText().equals(currentPlayer)) ||
                    (buttons[0][i].getText().equals(currentPlayer) && buttons[1][i].getText().equals(currentPlayer) && buttons[2][i].getText().equals(currentPlayer))) {
                return true;
            }
        }
        return (buttons[0][0].getText().equals(currentPlayer) && buttons[1][1].getText().equals(currentPlayer) && buttons[2][2].getText().equals(currentPlayer)) ||
                (buttons[0][2].getText().equals(currentPlayer) && buttons[1][1].getText().equals(currentPlayer) && buttons[2][0].getText().equals(currentPlayer));
    }

    private boolean checkForDraw() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (buttons[x][y].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void disableButtons() {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                buttons[x][y].setDisable(true);
            }
        }
    }

    public static void main(String[] args) {
        launch(TicTacToe.class);
    }
}
