package com.learningjava;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("My minimum value = " + myMinIntValue);
        System.out.println("My maximum value = " + myMaxIntValue);
        System.out.println("Busted maximum value = " + (myMaxIntValue  + 1));
        System.out.println("Busted minimum value = " + (myMinIntValue  - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long myLongValue = 100L;
        System.out.println(myLongValue);

        long bigLongLiteralValue = 2_345_456_305_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        byte myCoolByteValue = 115;
        short myCoolShortValue = 4573;
        int myCoolIntegerValue = 24;
        long mySuperCoolLongValue = 50000L + ((myCoolByteValue + myCoolShortValue + myCoolIntegerValue) * 10);
        System.out.println(mySuperCoolLongValue);

    }
}
