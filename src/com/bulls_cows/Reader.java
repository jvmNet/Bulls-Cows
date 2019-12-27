package com.bulls_cows;

import com.bulls_cows.gui.AlertBox;
import com.bulls_cows.gui.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Reader {
    private String userNumber = null;
    private static int levelGame = 0;

    public static int getLevelGame() {
        return levelGame;
    }

    public static void setLevelGame(int levelGame) {
        Reader.levelGame = levelGame;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public void gameLevelReader() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int beginGame = 1;
        boolean checkLevelGame = true;
        while(checkLevelGame){

            if(beginGame == 1) {
                System.out.println("Здравствуйте! Для начала игры, выберите уровень сложности (от 3 до 9 цифр)");
                System.out.println("Пожалуйста, сделайте свой выюор: ");
            }
            beginGame = beginGame + 1;
            try{
                setLevelGame(Integer.parseInt(reader.readLine()));
            } catch (Exception error){
                error.getStackTrace();
            }
            if(levelGame > 2 && levelGame < 10 && checkString(String.valueOf(levelGame))){
                System.out.println("Ваш выбор, число из " + getLevelGame() + " цифр. " + "\n" + "Игра началась! Удачи!");
                System.out.println("__________________________________________________________________________");

                checkLevelGame = false;

            } else {
                System.out.println("Пожалуйста, введите цифру - (уровень сложности) от 3 до 9!");
            }
        }
    }

    public void userNumberReader() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean checkUserNumber = true;
        while(checkUserNumber) {

            System.out.println("Попытка № " + Main.getCount() + ". Введите число: ");
            userNumber = reader.readLine();

            String chiter = "#help";

            if(userNumber.length() == Reader.getLevelGame() && doubleNumber(userNumber) == Reader.getLevelGame() && checkString(userNumber)) {
                checkUserNumber = false;
            } else {
                if(userNumber.equals(chiter)){
                    fileReader();
                } else {
                    String errorMessage = "- Вы ввели " + "'" + userNumber + "'" + ", а это не число из " + levelGame + " разных цифр! Пожалуйста, повторите попытку ввода!";
                }
            }

        }
        setUserNumber(userNumber);
    }

    public int doubleNumber(String number){
        Set<Character> mass = new HashSet<>();
        for(int i = 0; i < number.length(); i++) mass.add(number.charAt(i));
        return mass.size();
    }

    public boolean checkString(String string){
            try {
                Integer.parseInt(string);
            } catch (Exception e) {
                return false;
            }
        return true;
    }

    private void fileReader(){
        try{
            FileReader fileReader = new FileReader("d:/text.txt");
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext()){
                System.out.println("Вижу, что сложно) хорошо, получи, это тайное число: " + scanner.nextLine());
                fileReader.close();
            }
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Ошибка чтения файла!");
        }
    }
}






















