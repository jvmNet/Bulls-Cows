package com.bulls_cows.gui;

import com.bulls_cows.LevelGame;
import com.bulls_cows.RandomNumber;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    public ChoiceBox<String> choiceBox;
    public Label labelMenuLevelGame;
    public Label labelChoiceLevelGame;
    public Button buttonNewGame;
    public Label labelNewGame;
    public TextField inputUserNumber;
    public ListView<String> listView;
    public Button checkButton;

    public ImageView imageBull3;
    public ImageView imageBull4;
    public ImageView imageBull5;
    public ImageView imageBull6;
    public ImageView imageBull7;
    public ImageView imageBull8;
    public ImageView imageBull9;

    public MenuItem menuNewGame;
    public MenuItem menuCloseGame;
    public MenuItem menuRegulationGame;
    public Button buttonRestartGame;

    @FXML
    public void checkNumberButton(){

        if(!buttonNewGame.isDisable()) {
            AlertBox.alertMessage("Ошибка!", "Пожалуйста, выберите уровень сложности и начните игру!");
        } else {

        String textNumberInput = inputUserNumber.getText();

        String help = "#help";
        if(textNumberInput.equals(help)) {
            AlertBox.alertMessage("Помогаю!", "Вижу, что сложно) хорошо, получи, это тайное число: " + RandomNumber.getPcNumber());
            inputUserNumber.setText("");
        } else {

        try{
        if(CheckUserNumber.checkDoubleUserNumber(textNumberInput) && CheckUserNumber.checkIntegerUserNumber(textNumberInput) &&
                CheckUserNumber.checkLengthUserNumber(textNumberInput)){
            GamePlay.setUserNumberGUI(textNumberInput);

            WritePlay.resultWrite();

            ObservableList<String> items = FXCollections.observableArrayList(WritePlay.getMassResult());
            listView.setItems(items);

            if(GamePlay.resultBulls() == RandomNumber.getLevelGameNumber()) {
                inputUserNumber.setDisable(true);
                int count = WritePlay.getMassResult().size() - 1;
                new FinishGameBox().finishGameBox("Победа!","Поздравляю, Вы выиграли с " + count + " попытки!");
                //AlertBox.alertMessage("Победа!","Поздравляю, Вы выиграли с " + count + " попытки!");
                checkButton.setDisable(true);
            }

        } else {
            AlertBox.alertMessage("Ошибка!","- Вы ввели " + "'" + textNumberInput + "'" + ", а это не число из " + RandomNumber.getLevelGameNumber() + " разных цифр! Пожалуйста, повторите попытку ввода!");
        }
        } catch (Exception error) {
            AlertBox.alertMessage("Ошибка!","- Вы ввели " + "'" + textNumberInput + "'" + ", а это не число из " + RandomNumber.getLevelGameNumber() + " разных цифр! Пожалуйста, повторите попытку ввода!");
        }
        inputUserNumber.setText("");
        }
        }
    }

    @FXML
    public void startGameButton() {
        RandomNumber.setLevelGameNumber(choiceBox.getSelectionModel().getSelectedIndex() + 3);
        //labelMenuLevelGame.setText(LevelGame.getListLevelGame().get(choiceBox.getSelectionModel().getSelectedIndex()));
        newGame();
    }

    public void newGame(){

        choiceBox.setDisable(true);
        choiceBox.setVisible(false);

        buttonNewGame.setDisable(true);
        buttonNewGame.setVisible(false);

        labelChoiceLevelGame.setText("Найдите: ");

        labelNewGame.setText("Удачи!");

        switch(RandomNumber.getLevelGameNumber()){
            case 3: imageBull3.setVisible(true);
                break;
            case 4: imageBull4.setVisible(true);
                break;
            case 5: imageBull5.setVisible(true);
                break;
            case 6: imageBull6.setVisible(true);
                break;
            case 7: imageBull7.setVisible(true);
                break;
            case 8: imageBull8.setVisible(true);
                break;
            case 9: imageBull9.setVisible(true);
                break;
        }
    }

    @FXML
    public void initialize(URL location, ResourceBundle resources) {
        choiceBox.setItems(FXCollections.observableArrayList(LevelGame.getListLevelGame()));
        choiceBox.getSelectionModel().selectFirst();

        imageBull3.setVisible(false);
        imageBull4.setVisible(false);
        imageBull5.setVisible(false);
        imageBull6.setVisible(false);
        imageBull7.setVisible(false);
        imageBull8.setVisible(false);
        imageBull9.setVisible(false);

    }

    public void exitGame() {
        System.exit(0);
    }

    public void menuNewGame() {

        try {
            WritePlay.getMassResult().clear();
            listView.getItems().clear();

            RandomNumber.getPcNumber().delete(0, RandomNumber.getPcNumber().length());
            RandomNumber.getMassNumber().clear();

            GamePlay.getMassResultBullsCows().clear();

            buttonNewGame.setDisable(false);
            buttonNewGame.setVisible(true);
            labelNewGame.setText("");

            inputUserNumber.setDisable(false);
            checkButton.setDisable(false);

            imageBull3.setVisible(false);
            imageBull4.setVisible(false);
            imageBull5.setVisible(false);
            imageBull6.setVisible(false);
            imageBull7.setVisible(false);
            imageBull8.setVisible(false);
            imageBull9.setVisible(false);

            choiceBox.getSelectionModel().selectFirst();
            choiceBox.setDisable(false);
            choiceBox.setVisible(true);

            labelChoiceLevelGame.setText("Выберите уровень: ");

        } catch (Exception error){
            error.getMessage();
        }
    }

    public void menuTextRegulation() {
        RegulationBox.regulationGame();
    }
}









