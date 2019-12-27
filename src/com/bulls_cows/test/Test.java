package com.bulls_cows.test;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException{

        for(int i = 0; i < 10000; i++){

            try{
                Thread.sleep(200);
                System.out.println("                  " + "PC number: " );
            } catch (Exception e){
                System.out.println("Error");
            }
        }
    }
}

