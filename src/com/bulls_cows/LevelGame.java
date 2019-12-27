package com.bulls_cows;

import java.util.ArrayList;

public class LevelGame {

    private static ArrayList<String> listLevelGame = new ArrayList<>();

    public static ArrayList<String> getListLevelGame() {

        listLevelGame.add(0,"Уровень на 3 цифры");
        listLevelGame.add(1,"Уровень на 4 цифры");
        listLevelGame.add(2,"Уровень на 5 цифр");
        listLevelGame.add(3,"Уровень на 6 цифр");
        listLevelGame.add(4,"Уровень на 7 цифр");
        listLevelGame.add(5,"Уровень на 8 цифр");
        listLevelGame.add(6,"Уровень на 9 цифр");

        return listLevelGame;
    }
}
