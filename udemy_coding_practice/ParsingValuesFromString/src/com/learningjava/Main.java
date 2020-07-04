package com.learningjava;

public class Main {

    public static void main(String[] args) {
	String numberAsString = "2020";
        System.out.println("numberAsString= " + numberAsString);

        //Convert String to an Integer

        int number =Integer.parseInt(numberAsString); //Integer is a class parse.Int is the
        // method name for the parse
        System.out.println("number = " + number);
    }
}
