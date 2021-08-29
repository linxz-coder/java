package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1)); // this is a overflow
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1)); // this is a underflow

        int myMaxIntTest2 = 2_147_483_647; // It is acceptable form

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_648L;
        System.out.println(bigLongLiteralValue);

        //-------------casting-------------------
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2); //when we use "/", java will automatically transform
        // variables to int, so we need casting
        short myNewShortValue = (short) (myMinShortValue / 2);

        //-------------challenge------------------
        byte myByteValue = 120;
        short myShortValue = 30000;
        int myIntValue = 1000000;
        long myLongLongValue = 50000L + 10L * (myByteValue + myShortValue+ myIntValue);
        System.out.println(myLongLongValue);
        short shortTotal = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));

    }
}
