package com.bulls_cows.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    public static void alertMessage(String title, String message){
        Stage window = new Stage();
        window.setTitle(title);
        window.setResizable(false);
        window.getIcons().add(new Image(AlertBox.class.getResourceAsStream("logo.png")));
        window.initModality(Modality.APPLICATION_MODAL);

        Button closeButton = new Button("Ok");
        closeButton.setMaxSize(75,50);
        closeButton.setOnAction(e -> window.close());

        Label label = new Label();
        label.setText(message);

        VBox container = new VBox(15);
        container.setPadding(new Insets(10,15,10,15));
        container.setAlignment(Pos.CENTER);
        container.getChildren().addAll(label,closeButton);

        Scene scene = new Scene(container);
        window.setScene(scene);

        window.showAndWait();
    }
}
