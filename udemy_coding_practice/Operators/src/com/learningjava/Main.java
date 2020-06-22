package com.learningjava;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("newResult = " + result); //2
        System.out.println("previousResult = " + previousResult);
        result = result * 10; // 2* 10 = 20
        System.out.println("2 * 10 = " + result);
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 3 goes into 4 once
        //(4 is the current value of results) with one left over so the value of results
        //is now the remainder which is one
        System.out.println("The value of result (4 % 3) = " + result);

        //result = result + 1;
        result++; // 1 + 1 = 2

        System.out.println("Result = " + result);

        result--; // 2 - 1 = 1

        System.out.println("Result = " + result);

        //result (currently 1) + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("Result = " + result);

        //result (currently 3) + 6;
        result += 6; // 3 + 6 = 9
        System.out.println("Result = " + result);

        // result = result * 10; (current value is 9 so 9 * 10)
        result *= 10; // 9 * 10 = 90;
        System.out.println("Result = " + result);

        // result = result / 5; (current value is 90 so 90 / 5)
        result /= 5; // 90 * 5 = 18;
        System.out.println("Result = " + result);

        // result = result - 20; (current value is 18 so 18 - 20)
        result -= 20; // 18 - 20 = -2;
        System.out.println("Result = " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");
        System.out.println("And I'm scared of aliens.");

        //boolean isAlien2 = false;
        //if (isAlien2 == false) //You don't use ; because you don't want to close
        // the statement because if you do, the next line will be executed
        //no matter what the condition.
        //System.out.println("It is an alien!");


        boolean isAlien3 = false;
        if (isAlien3 == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I'm scared of aliens.");
        //use a code block {) when using if/then statement

        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You've got the high score!");
        }

        int topScore2 = 10;
        if (topScore2 != 100) {
            System.out.println("You've got the high score!");
        }
        int topScore3 = 104;
        if (topScore3 > 100) {
            System.out.println("You've got the highest score!");
        }

        int topScore4 = 100;
        if (topScore4 >= 100) {
            System.out.println("You've got one of the highest scores!");
        }

        int topScore5 = 10;
        if (topScore5 < 100) {
            System.out.println("You've got one of the higher scores!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore <= 20)) {

            System.out.println("Greater than second top score and less than top score");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is not an error");
        }

        boolean isCar = false;
        if (isCar == false) {  // if (!isCar) is the same thing
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (!wasCar) {
            System.out.println("wasCar is false");
        }
        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        if (isEighteenOrOver) {
            System.out.println("This person is 18 or over");
        }

        //Operator Challenge

        double stepOne = 20.00d;
        double stepTwo = 80.00d;
        double stepThree = ((stepOne + stepTwo) * 100.00d);
        System.out.println("Step 3 = " + stepThree);
        double stepFour = stepThree % 40.00d;
        // the remainder of (stepThree % 40.00) = 40.00 goes into
        // current value of stepThree - what is left over (the remainder)
        // is the value of stepFour
        System.out.println("The value of stepFour = " + stepFour);
        boolean stepFive = (stepFour == 0) ? true : false;
        if (stepFive) {
            System.out.println("The remainder value is 0");
        }
        if (!stepFive) {
            System.out.println("Got some remainder");
        }


    }

}