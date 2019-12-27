package com.bulls_cows;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Print {

    private ArrayList<String> massResult = new ArrayList<>();

    public ArrayList<String> getMassResult() {
        return massResult;
    }

    public void setMassResult(ArrayList<String> massResult) {
        this.massResult = massResult;
    }

    void print(Game game, Reader reader) {
        StringBuilder sb = new StringBuilder();
        switch(game.resultBulls()){
            case 0:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быков, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быков, ");
                break;
            case 1:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " бык, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " бык, ");
                break;
            case 2:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                break;
            case 3:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                break;
            case 4:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                break;
            case 5:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быков, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быков, ");
                break;
            case 6:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быков, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быков, ");
                break;
            case 7:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                break;
            case 8:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быков, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быков, ");
                break;
            case 9:
                System.out.print("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                sb.append("Ваше число - " + reader.getUserNumber() + ": " + game.resultBulls() + " быка, ");
                break;
        }
        switch(game.resultCows()){
            case 0:
                System.out.print(game.resultCows() + " коров" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " коров");
                break;
            case 1:
                System.out.print(game.resultCows() + " корова" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " корова");
                break;
            case 2:
                System.out.print(game.resultCows() + " коровы" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " коровы");
                break;
            case 3:
                System.out.print(game.resultCows() + " коровы" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " коровы");
                break;
            case 4:
                System.out.print(game.resultCows() + " коровы" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " коровы");
                break;
            case 5:
                System.out.print(game.resultCows() + " коров" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " коров");
                break;
            case 6:
                System.out.print(game.resultCows() + " коров" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " коров");
                break;
            case 7:
                System.out.print(game.resultCows() + " коров" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " коров");
                break;
            case 8:
                System.out.print(game.resultCows() + " коров" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " коров");
                break;
            case 9:
                System.out.print(game.resultCows() + " коровы" + "\n");
                System.out.println("__________________________________________________________________________");
                sb.append(game.resultCows() + " коровы");
                break;
        }
        massResult.add("Попытка № " + Main.getCount() + ". " + sb.toString());
    }

    void fileWriterRandomNumber(RandomNumber randomNumber) throws IOException{
        try(FileWriter fileWriter = new FileWriter("d:/text.txt")){
            fileWriter.append(randomNumber.getPcNumber());
            fileWriter.append('\n');
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("Ошибка записи в файл!");
        }
    }


}
