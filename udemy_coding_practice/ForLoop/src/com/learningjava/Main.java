package com.learningjava;

public class Main {

    public static void main(String[] args) {

        //for statement lets us loop a program a number of times
        double interestRate = 2;

        for (int i = 0; i < 7; i++) {
            System.out.println("$10,000 at " + interestRate + "% interest = " + calculateInterest(10000.0, interestRate));
           interestRate = interestRate + 1;
        }
    }
        public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate/100));

    }
}
