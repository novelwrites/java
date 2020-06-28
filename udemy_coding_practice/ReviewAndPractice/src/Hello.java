public class Hello { //body of the class Hello

    public static void main(String[] args) { //Method Block
        System.out.println("Hello Phil"); //text in quotes is a literal string - can't be changed

        int myFirstNumber = (10 + 5) * 23;  //declaration statement - declares variable - assigned
        // a memory location by java - don't need to know location - just use data
        // type and variable name
        //An expression is a construct that evaluates into a single value
        //to the right of the = sign is an expression
        int mySecondNumber = 12;
        int myThirdNumber = mySecondNumber + 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = myTotal - 1000;

        String playerOne = "Phil";
        String playerTwo = "Nancy";
        String playerThree = "Josh";
        String playerFour = "Melissa";

        int playerOneScore = 1500;
        int playerTwoScore = 900;
        int playerThreeScore = 400;
        int playerFourScore = 50;

        int playerOnePosition = 1;
        int playerTwoPosition = 2;
        int playerThreePosition = 3;
        int playerFourPosition = 4;

        System.out.println("My first number is " + myFirstNumber);
        System.out.println("The sum total = " + myTotal);
        System.out.println("My last variable =  " + myLastOne);

        //type sout to get System.out.println()

        primitiveChallenge();
        operatorPractice();
        ifThenPractice();
        testKnowledge();
        kilometerConversion();
        createCodePractice();
        loveMyPhil();
        calculateScore(myFirstNumber);
        tryIfThenElse();
        morePractice(myThirdNumber, myTotal);
        morePractice(300, 500);
        karmaGive();
        int grandTotalVal = returnPractice(myThirdNumber, myTotal); // method result - we get it when we run returnPractice
        System.out.println("We got grandTotalVal from running the returnPractice function and it is " + grandTotalVal);

       displayHighScorePosition(playerOne, playerTwo, playerThree, playerFour,
        playerOnePosition, playerTwoPosition, playerThreePosition, playerFourPosition);

        int playerPosition = calculateHighScorePosition(playerOneScore);
        System.out.println(playerPosition);
        playerPosition = calculateHighScorePosition(playerTwoScore);
        System.out.println(playerPosition);
        playerPosition = calculateHighScorePosition(playerThreeScore);
        System.out.println(playerPosition);
        playerPosition = calculateHighScorePosition(playerFourScore);
        System.out.println(playerPosition);

    }

    public static void primitiveChallenge() {

        byte firstNumber = 127;
        short secondNumber = 45;
        int thirdNumber = 9;
        long fourthNumber = ((firstNumber + secondNumber + thirdNumber) * 10) + 50000;
        System.out.println("The answer = " + fourthNumber);

    }

    public static void operatorPractice() {

        double result = 1 + 2;
        double previousResult = result;
        result = result - 1;
        System.out.println("result = " + result);
        System.out.println("previousResult = " + previousResult);
        result++;
        System.out.println("result++ = " + result);
        result *= 10;
        System.out.println("result*= = " + result);
        result--;
        System.out.println("result-- = " + result);
        result /= 4;
        System.out.println("result/ = " + result);

    }

    public static void ifThenPractice() {

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("There are no aliens!");
        }
        boolean bicyclingToday = true;
        if (bicyclingToday == true) {
            System.out.println("We are bicycling today!");
        }
        boolean rainRightNow = false;
        if (rainRightNow == false) {
            System.out.println("It is not raining right now.");
        }
        boolean husbandHandsome = true;
        if (husbandHandsome == true) {
            System.out.println("My husband is very handsome!");
        }

        boolean frenchFriesGreasy = true;
        if (frenchFriesGreasy == true) {
            System.out.println("Frenchfries are greasy.");
            System.out.println("But I like them anyway.");
        }
    }

    public static void testKnowledge() {

        int newNum = 6;
        int newNum2 = 36;
        int multiNum = newNum * newNum2;

        System.out.println("newnum * newNum2 = " + multiNum);

        boolean horseBackRiding = false;
        if (horseBackRiding == false) {
            System.out.println("I wish I could horsebackride today.");
            System.out.println("newnum * newNum2 = " + multiNum);
        }

        int topScore = 100;
        if (topScore <= 100) { //does this evaluate to true? If so, execute code block
            System.out.println("You got the top score!");
        }

        int topScore2 = 50;
        if (topScore2 == 49 || topScore == 100) {
            System.out.println("Top score1 is higher than top score2");
        } else System.out.println("Top score2 is lower than top score2");

        int bayHorses = 15;
        int sorrelHorses = 12;
        int paintHorses = 25;

        if (paintHorses < bayHorses && sorrelHorses < bayHorses) {
            System.out.println("We need more horses!!!");
            System.out.println("Let's buy some buckskins!");
        } else {
            System.out.println("We have enough horses (which should never be true).");

        }

        double appleSlices = 35;
        double orangeSlices = 23;
        if (appleSlices > 30 || orangeSlices == 10) {

            System.out.println("Yay! We have enough fruit!");
        }

        boolean haveCar = false;
        if (!haveCar) {

            System.out.println("We don't have a car!");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("Prints if isCar equals true");
        }
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true because isCar is true");
        }

    }

    public static void kilometerConversion() {
        double miles = 25;
        double kilometers = miles * 1.609344;
        System.out.println("25 miles = " + kilometers);
    }

    public static void createCodePractice() {

        boolean ifGameOver = true;
        int score = 250;
        int levelCompleted = 5;
        int bonus = 500;

        if (ifGameOver && score > 500) {
            System.out.println("Game is over and the score was over 500.");
        } else {
            System.out.println("Game might not be over and score might be less than 500");
        }

    }

    public static void loveMyPhil() {

        String handsomeHusband = "Phil";
        String beautifulBride = "Nancy";
        Boolean madlyInLove = true;

        if (handsomeHusband == "Phil" && beautifulBride == "Nancy" && madlyInLove) {
            System.out.println("We are so blessed - thank you to our Lord Jesus Christ!");
        } else {
            System.out.println("It's the wrong name.");
        }
    }

    public static void tryIfThenElse() {

        int try1 = 50;

        if (try1 == 30) {
            System.out.println("try1 = 30");
        } else if (try1 == 40) {
            System.out.println("try1 = 40");
        } else {
            System.out.println("We don't know what try1 is equal to.");

        }

    }

    public static void calculateScore(int myFirstNumber) {
        if (myFirstNumber > 1) {
            System.out.println("myFirstNumber equals " + myFirstNumber);
        }

    }

    //when you are passing the parameters to the function you need to name the data type
    // but don't need to when invoking (calling) the function
    public static void morePractice(int myThirdNumber, int myTotal) {
        int anotherNumber = 150;
        if ((myThirdNumber + myTotal + anotherNumber) > 23) {
            System.out.println(myThirdNumber + "," + " " + myTotal + "," + " " + anotherNumber);
        }

    }

    public static void karmaGive() {
        int amirKarma = 5;
        int markKarma = 5;
        int abramKarma = 5;
        if (amirKarma == 5 && markKarma == 5 && abramKarma == 5) {
            System.out.println("Amir and Mark and Abram rock! They are always" +
                    " helping and I just gave Amir " + amirKarma + " points, Mark "
                    + markKarma + " points, and Abram " + abramKarma + " points to " +
                    "recognize their contributions.");

        }
    }

    public static int returnPractice(int myThirdNumber, int myTotal) {
        int anotherNumber = 150;
        int grandTotal = 0;
        if ((myThirdNumber + myTotal + anotherNumber) > 23) {
            grandTotal = myThirdNumber + myTotal + anotherNumber;
            System.out.println(myThirdNumber + "," + " " + myTotal + "," + " " + anotherNumber + " = " + grandTotal);

            return grandTotal;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerOne, String playerTwo, String playerThree, String playerFour,
                                              int playerOnePosition, int playerTwoPosition, int playerThreePosition,
                                              int playerFourPosition) {


      System.out.println(playerOne + " managed to get into position " + playerOnePosition + " on the high score table.");
      System.out.println(playerTwo + " managed to get into position " + playerTwoPosition + " on the high score table.");
      System.out.println(playerThree + " managed to get into position " + playerThreePosition + " on the high score table.");
      System.out.println(playerFour + " managed to get into position " + playerFourPosition + " on the high score table.");
}

    public static int calculateHighScorePosition(int playerScore){

        if(playerScore == 1500) {

            return 1;
        }
        if(playerScore == 900) {

            return 2;
        }if(playerScore == 400) {

            return 3;
        }if(playerScore == 50) {

            return 4;
        }
        return -1;
    }

}



