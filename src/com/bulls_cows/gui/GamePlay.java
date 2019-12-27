package com.bulls_cows.gui;

import com.bulls_cows.RandomNumber;

import java.util.ArrayList;

public class GamePlay {
    private static ArrayList<Character> massResultBullsCows = new ArrayList<>();
    private static String userNumberGUI = null;

    public static ArrayList<Character> getMassResultBullsCows() {
        return massResultBullsCows;
    }

    public static String getUserNumberGUI() {
        return userNumberGUI;
    }

    public static void setUserNumberGUI(String userNumberGUI) {
        GamePlay.userNumberGUI = userNumberGUI;
    }

    public static void createMassResultBullsCows(){
        for(int i = 0; i < String.valueOf(getUserNumberGUI()).length(); i++) massResultBullsCows.add(RandomNumber.getPcNumber().charAt(i));
    }

    static int resultCows(){
        createMassResultBullsCows();
        int countCows = 1;
        for(int user = 0; user < getUserNumberGUI().length(); user++){
            for(int random = 0; random < getUserNumberGUI().length(); random++){
                if(String.valueOf(getUserNumberGUI()).charAt(user) == getMassResultBullsCows().get(random)) countCows++;
            }
        }
        return (countCows - 1) - resultBulls();
    }

    static int resultBulls(){
        createMassResultBullsCows();
        int countBulls = 1;
        for(int i = 0; i < getUserNumberGUI().length(); i++){
            if(String.valueOf(getUserNumberGUI()).charAt(i) == getMassResultBullsCows().get(i)) countBulls++;
        }
        return countBulls - 1;
    }
}
