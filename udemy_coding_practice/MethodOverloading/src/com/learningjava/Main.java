package com.learningjava;

public class Main {
//OVERLOADING A METHOD - WE CREATE A UNIQUE METHOD SIGNATURE:
//YOU HAVE TO CHANGE THE NUMBER OF PARAMETERS IN ORDER TO MAKE METHOD UNIQUE
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500); //This line calls method
        //calculateScore and passes parameters Tim which is a string and 500
        // which is an integer. By adding int newScore = in the front, we now
        // have a new variable that will be the value of the return.
        System.out.println("Score with bonus = " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unknown player scored " + score + " points");
        return score * 1000;


    }

    public static int calculateScore() {
        System.out.println("No player name and no player score");
        return 0;


    }



}
