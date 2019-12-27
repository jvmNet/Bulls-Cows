package com.bulls_cows;

import java.io.IOException;

public class Main{
    private static RandomNumber randomNumber = new RandomNumber();
    private static Reader reader = new Reader();
    private static Game game = new Game(randomNumber, reader);
    private static Print print = new Print();
    private static int count = 1;

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) throws IOException{
        startGame();
    }

    public static void startGame() throws IOException{
        reader.gameLevelReader();
        while(true) {
            reader.userNumberReader();
            print.print(game, reader);
            for(String masive: print.getMassResult()) System.out.println(masive);
            count++;
            print.fileWriterRandomNumber(randomNumber);
            if(game.resultBulls() == Reader.getLevelGame()) break;
        }
        System.out.println("Вы угадали с: " + (count - 1) + " попытки.");
    }
}
