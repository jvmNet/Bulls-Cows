package com.bulls_cows.gui;

import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ResultGameBox {
    private static Stage window;

    public static void resultGameBox(){
        window = new Stage();
        window.setTitle("Ход игры:");
        window.setResizable(false);
        window.getIcons().add(new Image(ResultGameBox.class.getResourceAsStream("logo.png")));
        window.initModality(Modality.APPLICATION_MODAL);

        Button buttonClose = new Button();
        buttonClose.setText("Закрыть окно");
        buttonClose.setOnAction(e -> window.close());

        ListView<String> listResultGame = new ListView<>();
        listResultGame.setMinSize(325,275);
        listResultGame.setItems(FXCollections.observableList(WritePlay.getMassResult()));

        VBox container = new VBox(15);
        container.setPadding(new Insets(5,5,10,5));
        container.setAlignment(Pos.CENTER);
        container.getChildren().addAll(listResultGame,buttonClose);

        Scene scene = new Scene(container);
        window.setScene(scene);

        window.showAndWait();
    }
}
