package com.learningjava;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int score2 = 10000;
        int levelCompleted2 = 8;
        int bonus2 = 200;

       /* if (score == 5000) {

            System.out.println("Your score was 5000");
        } //We could get rid of the code block {} starting in line 12
        // because we only have one statement we will be executing after
        // the test - BUT we can't add another line without the code block
        //because if we did, it won't be part of the "if" evaluation and will
        //execute regardless. Adding the {} ensures the code will execute properly.
        //Best practice - always use code blocks {} for clarity.
        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Your score was 5000 or greater");
        }

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        }  else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        }     else {
                    System.out.println("Your score was 5000 or greater");

       //As soon as a condition is met, it executes that code block and ignores the others
       //further down the line and begins again on the first line after the last curly brace.
                }
            }
        }
*/

        if (gameOver == true) { //can be abbreviated if(gameOver) because default val is true
            //(we set it to true above)
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            int finalScore2 = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your final score was " + finalScore2);


            //Code blocks can access variables outside of the code block and ALSO
            //allow you to create variables inside the code block (int finalScore)
            //BUT once that line of code is executed in the code block  - intellij
            //deletes that variable and it is no longer available for use outside of
            //that code block.
            //Concepts of variables inside a code block is called scope - accessibility of
            //variables

        }
    }

}
