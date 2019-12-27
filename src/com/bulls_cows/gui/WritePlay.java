package com.bulls_cows.gui;

import com.bulls_cows.LevelGame;
import com.bulls_cows.RandomNumber;

import java.util.ArrayList;
import java.util.List;

public class WritePlay {

    private static StringBuilder sbResultWrite = new StringBuilder();
    private static List<String> massResult = new ArrayList<>();

    public static void setMassResult(List<String> massResult) {
        WritePlay.massResult = massResult;
    }

    public static void setSbResultWrite(StringBuilder sbResultWrite) {
        WritePlay.sbResultWrite = sbResultWrite;
    }

    public static StringBuilder getSbResultWrite() {
        return sbResultWrite;
    }

    public static List<String> getMassResult() {
        return massResult;
    }

    static void resultWrite() {
        StringBuilder sb = new StringBuilder();
        switch(GamePlay.resultBulls()){
            case 0:
                //System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " быков, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " быков, ");
                break;
            case 1:
                //System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " бык, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " бык, ");
                break;
            case 2:
               // System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " быка, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " быка, ");
                break;
            case 3:
               // System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " быка, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " быка, ");
                break;
            case 4:
               // System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " быка, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " быка, ");
                break;
            case 5:
               // System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " быков, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " быков, ");
                break;
            case 6:
               // System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " быков, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " быков, ");
                break;
            case 7:
               // System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " быка, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " быка, ");
                break;
            case 8:
               // System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " быков, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " быков, ");
                break;
            case 9:
               // System.out.print("Ваше число - " + GamePlay.getUserNumberGUI() + ": " + GamePlay.resultBulls() + " быка, ");
                sb.append("Ваше число - " + GamePlay.getUserNumberGUI() + ":   " + GamePlay.resultBulls() + " быка, ");
                break;
        }
        switch(GamePlay.resultCows()){
            case 0:
                //System.out.print(GamePlay.resultCows() + " коров" + "\n");
                sb.append(GamePlay.resultCows() + " коров");
                break;
            case 1:
              //  System.out.print(GamePlay.resultCows() + " корова" + "\n");
                sb.append(GamePlay.resultCows() + " корова");
                break;
            case 2:
                //System.out.print(GamePlay.resultCows() + " коровы" + "\n");
                sb.append(GamePlay.resultCows() + " коровы");
                break;
            case 3:
               // System.out.print(GamePlay.resultCows() + " коровы" + "\n");
                sb.append(GamePlay.resultCows() + " коровы");
                break;
            case 4:
               // System.out.print(GamePlay.resultCows() + " коровы" + "\n");
                sb.append(GamePlay.resultCows() + " коровы");
                break;
            case 5:
               // System.out.print(GamePlay.resultCows() + " коров" + "\n");
                sb.append(GamePlay.resultCows() + " коров");
                break;
            case 6:
               // System.out.print(GamePlay.resultCows() + " коров" + "\n");
                sb.append(GamePlay.resultCows() + " коров");
                break;
            case 7:
               // System.out.print(GamePlay.resultCows() + " коров" + "\n");
                sb.append(GamePlay.resultCows() + " коров");
                break;
            case 8:
              //  System.out.print(GamePlay.resultCows() + " коров" + "\n");
                sb.append(GamePlay.resultCows() + " коров");
                break;
            case 9:
               // System.out.print(GamePlay.resultCows() + " коровы" + "\n");
                sb.append(GamePlay.resultCows() + " коровы");
                break;
        }
        setSbResultWrite(sb);
        int count = massResult.size() + 1;
        massResult.add(count + " попытка.   " + sb.toString());
        if(GamePlay.resultBulls() == RandomNumber.getLevelGameNumber()) massResult.add("Вы выиграли с " + count + " попытки!");
    }
}
