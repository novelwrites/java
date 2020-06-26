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

        System.out.println("My first number is " + myFirstNumber);
        System.out.println("The sum total = " + myTotal);
        System.out.println("My last variable =  " + myLastOne);

      //type sout to get System.out.println()

        primitiveChallenge();
        operatorPractice();
        ifThenPractice();
        testKnowledge();


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
        if(rainRightNow == false) {
            System.out.println("It is not raining right now.");
        }
        boolean husbandHandsome = true;
        if(husbandHandsome==true) {
            System.out.println("My husband is very handsome!");
        }

        boolean frenchFriesGreasy = true;
        if (frenchFriesGreasy==true) {
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
        if(horseBackRiding == false) {
            System.out.println("I wish I could horsebackride today.");
            System.out.println("newnum * newNum2 = " + multiNum);
        }
    }
}


