package com.bulls_cows.gui;

import com.bulls_cows.RandomNumber;

import java.util.HashSet;
import java.util.Set;

public class CheckUserNumber {

    static boolean checkDoubleUserNumber(String textNumber){
        Set<String> mass = new HashSet<>();
        for(int i = 0; i < RandomNumber.getLevelGameNumber(); i++) mass.add(String.valueOf(textNumber.charAt(i)));

        if(mass.size() == RandomNumber.getLevelGameNumber()){
            return true;
        }
    return false;
    }

    static boolean checkIntegerUserNumber(String textNumber){
        try{
            Integer.parseInt(textNumber);
            return true;
        } catch (Exception error){
            return false;
        }
    }

    static boolean checkLengthUserNumber(String textNumber){
        if(textNumber.length() == RandomNumber.getLevelGameNumber()){
            return true;
        } else {
            return false;
        }
    }
}
