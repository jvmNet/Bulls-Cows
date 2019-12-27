package com.bulls_cows;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RandomNumber {
    private static StringBuilder pcNumber;
    private static Set<Integer> massNumber = new LinkedHashSet<>();
    private static int levelGameNumber = 0;

    public static Set<Integer> getMassNumber() {
        return massNumber;
    }

    public static StringBuilder getPcNumber() {
        createRandomNumber();
        return pcNumber;
    }

    public static int getLevelGameNumber() {
        return levelGameNumber;
    }

    public static void setLevelGameNumber(int levelGameNumber) {
        RandomNumber.levelGameNumber = levelGameNumber;
    }

    public static void createRandomNumber() {
        pcNumber = new StringBuilder();
        boolean check = true;
        while(check){
            final int number = (int)(Math.random()*9);
            switch (massNumber.size()){
                case 0: massNumber.add(number);
                break;
                case 1: massNumber.add(number);
                break;
                case 2: massNumber.add(number);
                break;
                case 3: massNumber.add(number);
                break;
                case 4: massNumber.add(number);
                break;
                case 5: massNumber.add(number);
                break;
                case 6: massNumber.add(number);
                break;
                case 7: massNumber.add(number);
                break;
                case 8: massNumber.add(number);
                break;
                case 9: check = false;
                break;
            }
        }
        Iterator<Integer> iterator = massNumber.iterator();
        int i = 0;
        while(i < getLevelGameNumber()){
            pcNumber.append(iterator.next());
            i++;
        }
    }
}
