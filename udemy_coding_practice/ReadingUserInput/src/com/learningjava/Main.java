package com.learningjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); //Scanner (a text scanner) is a built-in java class that allows us to read user input
        //method called Next returns a string, allowing us to save the returned value to a variable
        //new keyword - we are creating a new instance of Scanner, meaning we are creating a new object of type Scanner
        //We have been using primitive types so we haven't had to use the new keyword in previous videos
        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt(); //java parses a string into an integer for us with this method
        scanner.nextLine(); //Whenever we read in a number from the keyboard, we push the enter key like we just
        // did for age, which ends the line. By doing scanner.nextline without assigning it to a variable, it handles
        // the "next line" character (enter key), so program will not mistake the input from the enter key
        // for the name input and will read in the next user input which in this case is name.
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();//We call this to read a line of input from the console
        //After finished using the scanner we should close it using the close method
        //scanner.nextLine and scanner.close are built-in methods available to us
        int age = (2020 - yearOfBirth); //Calculate age from user input stored on line 14
        System.out.println("Your name is " + name + " and your DOB is " + yearOfBirth + " and you are " + age + " years old.");
        //prints out what was typed in by the user

        scanner.close(); //releases memory scanner was using internally
    }
}
