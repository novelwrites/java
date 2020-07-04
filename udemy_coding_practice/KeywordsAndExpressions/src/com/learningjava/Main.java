package com.learningjava;

public class Main {

    public static void main(String[] args) {

        // one mile is equal to 1.60934 kilometres
        //How many km in 100 miles? The expression is
        //kilometres = (100 * 1.60934);
        //data type is not part of expression
        double kilometres = (100 * 1.60934); //variables, values, and operators
        //adding data type and semicolon at end makes it a valid java statement

        int highScore = 50; //expression is highScore = 50

        if (highScore == 50) {  //only highScore - 50 is expression, if is a keyword
            System.out.println("This is an expression"); //System.out.println is a method
            // "this is an expression" is an expression
        //video challenge: score = 100   score > 99 "You got the high score!"   score = 0
        }
    }
}