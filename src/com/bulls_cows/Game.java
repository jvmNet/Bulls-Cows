package com.bulls_cows;

import java.util.ArrayList;

class Game {
    private RandomNumber randomNumber = new RandomNumber();
    private Reader reader = new Reader();
    private ArrayList<Character> massBullsCows = new ArrayList<>();

    public RandomNumber getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(RandomNumber randomNumber) {
        this.randomNumber = randomNumber;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    Game(RandomNumber randomNumber, Reader reader) {
        this.randomNumber = randomNumber;
        this.reader = reader;
    }

    ArrayList<Character> creatMass(){
        for(int i = 0; i < String.valueOf(reader.getUserNumber()).length(); i++) massBullsCows.add(randomNumber.getPcNumber().charAt(i));
        return massBullsCows;
    }

    int resultCows(){
        creatMass();
        int countCows = 1;
        for(int user = 0; user < String.valueOf(reader.getUserNumber()).length(); user++){
            for(int random = 0; random < String.valueOf(reader.getUserNumber()).length(); random++){
                if(String.valueOf(reader.getUserNumber()).charAt(user) == massBullsCows.get(random)) countCows++;
            }
        }
        return (countCows - 1) - resultBulls();
    }

    int resultBulls(){
        creatMass();
        int countBulls = 1;
        for(int i = 0; i < String.valueOf(reader.getUserNumber()).length(); i++){
            if(String.valueOf(reader.getUserNumber()).charAt(i) == massBullsCows.get(i)) countBulls++;
        }
        return countBulls - 1;
    }
}
