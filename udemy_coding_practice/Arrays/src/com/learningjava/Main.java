package com.learningjava;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[10]; //data type integer with 10 elements in it
        //myIntArray [5] = 50; //Saves the value of 50 for index 6 (since index starts at 0)
        //double [] myDoubleArray = new double[10];
        //System.out.println(myIntArray[5]);
        //int [] myIntArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println(myIntArray2[0]);
        //System.out.println(myIntArray2[6]);
        //System.out.println(myIntArray2[8]);

        //int [] myIntArray3 = new int[35];
        //for(int i=0; i<myIntArray3.length; i++) { //myIntArray.length is a property you can
        //   myIntArray3[i] = i*20; //use for the size of the array instead of a numerical value
        //}

        for (int i = 0; i< myIntArray.length; i++) {
            myIntArray[i] = i * 20; //Fills values in array as index value * 20

        }
        printArray(myIntArray); //Calls printArray method, passing myIntArray elements
        //into array

    }

     public static void printArray(int[] array) {
            for(int i=0; i<array.length; i++) {
                System.out.println("Element " + i + ", value is " + array[i]);
            }
        }

    }

