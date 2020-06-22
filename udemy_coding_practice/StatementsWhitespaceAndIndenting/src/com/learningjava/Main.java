package com.learningjava;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50; //statement is entire line
        myVariable++;
        myVariable--;
        System.out.println("this is a test"); //System.out.println is a method call
        //the entire line is a statement, what is in () is parameters passed
        //Typically need a ; to make a line a statement but there are exceptions
        //In java statements can cover multiple lines:
        System.out.println("This is" +
                " another" +
                " and still more.");

        int anotherVariable = 50; anotherVariable--; System.out.println (anotherVariable);
        //Can put statements on same line (but can be confusing)
        // but not recommended. ; is typically statement terminator.
        //Good idea to use white space for clarity - Java will figure it out if it's
        //one space or several. Always put a space between data type and expression
        //and also between variable names and operators for clarity

        //Indent code so its easier to read - typically start indenting code from method
        //definition opening line: public class Main {
        // then automatically indents (public static void main(String[] args) {
        //and so on - Intellij will auto indent for us. Easier to follow logical flow of code.
        //Intellij has a Code - Reformat code option in case you mess it up :)



    }
}
