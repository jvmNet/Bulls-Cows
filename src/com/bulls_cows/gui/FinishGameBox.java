package com.bulls_cows.gui;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class FinishGameBox {
    private static Stage window;


    public static void finishGameBox(String title, String message){
        window = new Stage();
        window.setTitle(title);
        window.setResizable(false);
        window.getIcons().add(new Image(FinishGameBox.class.getResourceAsStream("logo.png")));
        window.initModality(Modality.APPLICATION_MODAL);

        Label labelMessage = new Label();
        labelMessage.setText(message);


        Button buttonNewGame = new Button();
        buttonNewGame.setText("Закрыть окно");
        buttonNewGame.setMinSize(125,25);
        buttonNewGame.setOnAction(e -> window.close());

        Button buttonResultGame = new Button();
        buttonResultGame.setText("Посмотреть ход игры");
        buttonResultGame.setMinSize(125,25);
        buttonResultGame.setOnAction(e -> ResultGameBox.resultGameBox());

        Button buttonFinishGame = new Button();
        buttonFinishGame.setText("Выйти с игры");
        buttonFinishGame.setMinSize(125,25);
        buttonFinishGame.setOnAction(e -> System.exit(0));

        VBox vContainer = new VBox(25);
        vContainer.setPadding(new Insets(10,15,10,15));
        HBox hContainer = new HBox(25);
        hContainer.setPadding(new Insets(10,15,10,15));

        hContainer.getChildren().addAll(buttonResultGame, buttonNewGame, buttonFinishGame);
        vContainer.getChildren().addAll(labelMessage, hContainer);
        hContainer.setAlignment(Pos.CENTER);
        vContainer.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vContainer);
        window.setScene(scene);

        window.showAndWait();

    }
}
