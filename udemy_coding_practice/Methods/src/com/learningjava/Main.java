package com.learningjava;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        String namePlayer = "Phil";
        int tablePosition = 20;
        //You can use variable names OR hard code values for arguments passed to method
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus); //runs method created below
        //int highScore will hold value of return
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        //highScore = calculateScore(gameOver, score, levelCompleted, bonus); //runs method created below
        //int highScore will hold value of return
        //System.out.println("Your final score was " + highScore);
        //calculateScore(true, score, levelCompleted, bonus); //runs method created below

        //if (gameOver == true) { //can be abbreviated if(gameOver) because default val is true
        //(we set it to true above)
        //int finalScore = score + (levelCompleted * bonus);
        //System.out.println("Your final score was " + finalScore);

        //calculateScore(true, 400, 3, 50); //runs method created below
        displayHighScorePosition(namePlayer, tablePosition);

        int highScorePosition = calculateHighScorePosition(1500); //int highScorePosition holds the value of the return
        displayHighScorePosition("Josh", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Brett", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Christian", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Eusebio", highScorePosition);
    }

    //WE ARE CREATING A REUSABLE METHOD BELOW:

    public static void displayHighScorePosition (String namePlayer, int tablePosition) {

        System.out.println(namePlayer + " managed to get into position " + tablePosition +
                " on the high table.");
    }

//WE ARE CREATING A REUSABLE METHOD BELOW:

    public static int calculateHighScorePosition (int scorePlayer) {

        //if (scorePlayer >= 1000) {
          //  return 1;
        //} else if (scorePlayer >= 500) {
         //   return 2;
        //} else if (scorePlayer >= 100){
         //   return 3;
        //} else{
         //   return 4;
        int position = 4; //assunes position 4 will be returned
        if (scorePlayer >= 1000) {
            position = 1;
        } else if (scorePlayer >= 500) {
            position = 2;
        } else if (scorePlayer >= 100) {
            position = 3;
        }
        return position;
    }


    //WE ARE CREATING A REUSABLE METHOD BELOW:
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        //anything between {} is the statement
        // that is part of the method called calculateScore
        //arguments are the actual values, not the data types of the variables

        if (gameOver == true) { //can be abbreviated if(gameOver) because default val is true
            //(we set it to true above)
            int finalScore = score + (levelCompleted * bonus) + 50;
            //System.out.println("Your final score was " + finalScore);
            return finalScore;
            // } else { Could do else statement or just do a return after return finalScore;}

            //return -1;
            //}
        }
            return -1; //conventionally used to indicate an error
//When setting up a return - have to send back a value even if statement isn't true - you have to
//account for all program variations
        }

}



//Methods allow us to reuse code and helps keep code organized
//We have been using a method all along - the Main method
//Start a new method by dropping down past last curly brace of previous method
//Can't do a method within a method but still want it in public class so that it
//is still in the class - a new method would begin right after previous method's
//final } but before class's final }

//If you are creating a method but don't want to return anything, you use the keyword void
//But you can have a method return a value that can be used - you have to change the word void
//to the data type you want to send back. Example - let's get final score that is displayed on
//the screen returned back to us.

//Methods returning void are referred to as procedures; if methods return a value referred to as a function