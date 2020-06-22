package com.learningjava;

//GOOD EXAMPLE OF USE FOR AN ARRAY/ We'll allow user to input some numbers and avg them

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);//allows you to type in input
    //into the console and it gets returned back into program
    //scanner retrieves it

    //We are defining new variable called
    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5); //Create a method that allows us to type in 5 numbers
        //and return those 5 numbers in the form of an array - those numbers will be stored
        //into the myIntegers array when method is called
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {// [] means we are returning an array (input values)
        System.out.println("Enter " + number + " integer values.\r"); // \r so goes to next line

        //number is number of array elements we want to define for our array
        int[] values = new int[number];   //defines our array - assigning number of
        //array elements in (int number) line 22 and that is what we are putting in number array, line 26

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt(); //accepts integers from keyboard, returns it and
            //it is stored in our array
        }

        return values; //returns array back to line 16 - assigns values to myIntegers

    }

    public static double getAverage(int[] array) { //named array -  array
        int sum = 0; //local variable that is sum total
        for (int i = 0; i < array.length; i++) { //goes through array
            sum += array[i]; // += means we are adding the values to sum, not overwriting it
            //total sum is stored in local variable called sum
        }
            return (double) sum / array.length; //divides total of all the values in the
            // array by the length of the array to get the average
            //Last thing is to update our main method and print out a message - line 22

        }
    }
//OUR FUNCTION Get average actually returns average of total number of elements!!!

//YAY!!! It works!!!



