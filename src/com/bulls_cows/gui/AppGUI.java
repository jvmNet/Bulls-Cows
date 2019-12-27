package com.bulls_cows.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class AppGUI extends Application {
    private Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Быки и Коровы");
        window.getIcons().add(new Image(AppGUI.class.getResourceAsStream("logo.png")));
        window.setResizable(false);

        Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));
        Scene sceneWindow = new Scene(root);
        window.setScene(sceneWindow);

        window.show();
    }

    public static void main(String[] args){
        launch(args);

    }
}
