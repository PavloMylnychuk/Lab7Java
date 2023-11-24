package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ControlPanel extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Control Panel");

        // Створення кнопок
        Button stopShipAIButton = new Button("Stop Ship AI");
        Button resumeShipAIButton = new Button("Resume Ship AI");
        Button stopSteamboatAIButton = new Button("Stop Steamboat AI");
        Button resumeSteamboatAIButton = new Button("Resume Steamboat AI");

        // Створення випадаючих списків
        ComboBox<String> shipAIPriority = new ComboBox<>();
        shipAIPriority.getItems().addAll("Low", "Medium", "High");
        ComboBox<String> steamboatAIPriority = new ComboBox<>();
        steamboatAIPriority.getItems().addAll("Low", "Medium", "High");

        // Розміщення кнопок та випадаючих списків у контейнері
        VBox root = new VBox(10);
        root.getChildren().addAll(
                stopShipAIButton, resumeShipAIButton,
                stopSteamboatAIButton, resumeSteamboatAIButton,
                shipAIPriority, steamboatAIPriority
        );

        // Додавання обробників подій для кнопок (припустимо, що маєте класи для управління)
        stopShipAIButton.setOnAction(e -> {
            // Логіка зупинки Ship AI
            // shipAI.stop();
        });

        resumeShipAIButton.setOnAction(e -> {
            // Логіка відновлення Ship AI
            // shipAI.resume();
        });

        stopSteamboatAIButton.setOnAction(e -> {
            // Логіка зупинки Steamboat AI
            // steamboatAI.stop();
        });

        resumeSteamboatAIButton.setOnAction(e -> {
            // Логіка відновлення Steamboat AI
            // steamboatAI.resume();
        });

        shipAIPriority.setOnAction(e -> {
            String selectedPriority = shipAIPriority.getValue();
            // Логіка встановлення пріоритету для Ship AI
            // shipAI.setPriority(selectedPriority);
        });

        steamboatAIPriority.setOnAction(e -> {
            String selectedPriority = steamboatAIPriority.getValue();
            // Логіка встановлення пріоритету для Steamboat AI
            // steamboatAI.setPriority(selectedPriority);
        });

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
