package com.learningjava;

public class Main {

    public static void main(String[] args) {
	    //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //We'll be able to create our own data types called classes

        //String is not a primitive data type - it's actually a Class.
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString + ".");
        myString = myString + ", and this is more ";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2020";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);



    }
}
