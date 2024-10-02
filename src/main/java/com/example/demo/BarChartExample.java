package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarChartExample extends Application {

    @Override
    public void start(Stage stage) {
        // Create the axes for the bar chart
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        // Create the BarChart using the correct class from JavaFX
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        // Set chart title and axis labels
        barChart.setTitle("Populations of the Nordic countries");
        xAxis.setLabel("Country");
        yAxis.setLabel("Population");

        // Create a series to hold the population data
        XYChart.Series<String, Number> populations = new XYChart.Series<>();
        populations.setName("Population Data"); // Optional: name your series
        populations.getData().add(new XYChart.Data<>("Sweden", 10313447));
        populations.getData().add(new XYChart.Data<>("Denmark", 5809502));
        populations.getData().add(new XYChart.Data<>("Finland", 5537364));
        populations.getData().add(new XYChart.Data<>("Norway", 5372191));
        populations.getData().add(new XYChart.Data<>("Iceland", 343518));

        // Add the series to the chart
        barChart.getData().add(populations);

        // Create the scene and display the bar chart
        Scene view = new Scene(barChart, 640, 480);
        stage.setScene(view);
        stage.setTitle("Bar Chart Example"); // Set the window title
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
