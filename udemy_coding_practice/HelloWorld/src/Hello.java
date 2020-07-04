public class Hello {

    public static void  main(String[] args) {
        System.out.println("Hello Phil");

        int myFirstNumber = (10 + 5) + (2 * 10); /*declaration statement*/
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotalNumber = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastNumber = myTotalNumber - 1000;


        System.out.println("My numbers added together equals " + (myFirstNumber + mySecondNumber + myThirdNumber + myTotalNumber));
        System.out.println("This is fun!");
        System.out.println("The value of my last number is " + myLastNumber);

    }
}
