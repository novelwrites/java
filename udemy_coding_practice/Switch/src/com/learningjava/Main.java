package com.learningjava;

public class Main {

    public static void main(String[] args) {
	    int val = 1;
	    if(val == 1) {
            System.out.println("Value was 1");
        } else if (val == 2) {
	        System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");

    }

	    int switchValue = 3;

	    switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break; //breaks out of switch statement if gets to it

            case 2: case 3: case 4:
                System.out.println("Value was a " + switchValue);
                break; //breaks out of switch statement if gets to it

            default:
                    System.out.println("Was not 1 or 2 or 3 or 4");

                    break; //breaks out of switch statement if gets to it
        }




    }
}
