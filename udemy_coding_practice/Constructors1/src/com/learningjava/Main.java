package com.learningjava;

public class Main {

    public static void main(String[] args) {

        BankingAccount checking = new BankingAccount();

        checking.setAccountNumber(347348);
        checking.setBalance(7456.32);
        checking.setName("Cynthia A. Middleton");
        checking.setEmail("middletonc@aol.com");
        checking.setPhoneNumber("765-734-0923");

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
