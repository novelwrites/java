package com.learningjava;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	int myIntValue = 10;
	int anotherIntValue = myIntValue;

	System.out.println("myIntValue = " + myIntValue);
	System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray; //2 arrays pointing to same place in memory

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray[0] = 2;

        System.out.println("After change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("After modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("After modify anotherArray= " + Arrays.toString(anotherArray));

    }
//method can't modify an array itself, it can only de-reference it
    private static void modifyArray(int[] array){

        array[0] =2;
        array = new int[] {1, 2, 3, 4, 5}; //is now de-referenced: points to a new place
        //in memory since we used a new keyword
        System.out.println("After de-referencing array= " + Arrays.toString(array));
    }
}
//Whenever see a NEW keyword it means we are creating a NEW object
//reference types hold a reference or an address to the object, but not the object itself
//so the myIntArray holds a reference or address to an array in memory, can't access the object directly
//reference is address of an object in array

//BOTH variables are references to an array and because they are referencing the same
// array in memory:
//We update one, it will update in the other; there is only one copy of the array that
//both variables are pointing to.

//Reference variables represent the address of the variable rather than the variable itself.
//In effect we have only one array in memory that both are pointing to.