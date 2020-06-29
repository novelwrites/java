package com.learningjava;

public class BankingAccount {

    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    //Definition of a constructor: A Java constructor is special method that is called when
    // an object is instantiated. In other words, when you use the new keyword. The purpose
    // of a Java constructor is to initialize the newly created object before it is used.
    // A Java class constructor initializes instances (objects) of that class
    //A constructor only has an access modifier and the name of the class
    //and number of parameters. new BankingAccount() in Main will call it so you can use
    //it to initialize the object you are creating and whatever else you want to do when the object
    //is being created - its only called once at the start when we are creating
    //the new object. We can set the initial values of the field in Main here instead, and not have
    // to use setters.
    //public BankingAccount () {

       //special "this" used only if no parameters are passed and need a default when initialized
        //this(123456, 100.00, "default name", "default email", "default phone");
        //System.out.println("Empty constructor called");
    //}
    //Constructor below is being used to initialize values of object
    public BankingAccount (int accountNumber, double balance, String name, String email, String phoneNumber) {
        this.accountNumber = accountNumber; //this.accountNumber is field, accountNumber is parameter
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public void deposit(double depositAmount) { //deposits money into account
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) { //tests for sufficient funds and withdrawal
        if(this.balance - withdrawalAmount < 0) {
            System.out.println("Not enough funds available; unable to process withdrawal request");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed");
            System.out.println("Remaining balance = " + this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
