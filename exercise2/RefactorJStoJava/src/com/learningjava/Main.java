package com.learningjava;

public class Main {

    public static void main(String[] args) {

        int[] nums = {10, 23, 3, 4, 5, 2, 1};
        String[] greetings = {"hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا"};
        int[] binaries = {0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0};

        printNums(nums);
        printGreetings(greetings);
        printBinaries(binaries);
    }

    public static void printNums(int[] nums) {

        for (int i = 0; i < nums.length; i++) { //start at index 0 and index # of times as length of array
            System.out.println(nums[i]);
        }

            }

    public static void printGreetings(String[] greetings){

        for (int i = 0; i < greetings.length; i++) { //start at index 0 and index # of times as length of array
            System.out.println(greetings[i]);
        }
    }

    public static void printBinaries(int[] binaries){

        for (int i = 0; i < binaries.length; i++) { //start at index 0 and index # of times as length of array
            System.out.println(binaries[i]);
        }
    }
}