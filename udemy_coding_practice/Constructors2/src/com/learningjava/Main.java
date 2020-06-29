package com.learningjava;

public class Main {

    public static void main(String[] args) {
//The line below will have parameters to pass to the constructor it calls in BankingAccount
        //in order to initialize the fields when the object is created.
        BankingAccount checking = new BankingAccount (347348, 7456.32,
                "Cynthia A. Middleton", "middletonc@aol.com", "765-734-0923");
        System.out.println("Account constructor with parameters called");
        System.out.println(checking.getAccountNumber());
        System.out.println(checking.getBalance());
        System.out.println(checking.getName());
        System.out.println(checking.getEmail());
        System.out.println(checking.getPhoneNumber());
        //When you type new,
        // the name of the class, and (), it calls the constructor
        // which is a special method already created by java that creates the class --
        //its job is to create the object from the class for us.
        //I'm going to BankingAccount class to create my own constructor

        //Setting fields for the first time (not necessary because we are calling the
        //constructor in line 7
        //checking.setAccountNumber(347348);
        //checking.setBalance(7456.32);
        //checking.setName("Cynthia A. Middleton");
        //checking.setEmail("middletonc@aol.com");
        //checking.setPhoneNumber("765-734-0923");


        //Another way of doing this when you are creating an object for the
        // first time using a class and that's using constructors - you can create
        //all of these commands  to set the initial parameters or values  of the fields
        // or any other initialization you want to perform in one hit using a constructor
        //so we can replace everything we hand entered up top by going to our class
       // BankingAccount.java and adding a constructor - it turns out a constructor is
        //automatically created for you by java

        System.out.println("This checking account is account# " + checking.getAccountNumber());
        System.out.println("It has " + checking.getBalance());
        System.out.println("The name on the account is " + checking.getName());
        System.out.println("The email address for the accountholder is " + checking.getEmail());
        System.out.println("The primary phone number is " + checking.getPhoneNumber());

        checking.withdrawal(100.00);
        checking.withdrawal(8000.00);
        checking.deposit(450.00);

    }
}
