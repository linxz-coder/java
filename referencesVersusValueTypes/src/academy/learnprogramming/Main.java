package academy.learnprogramming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //value types
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        //reference types: array, class, object... (一个物体的编号或者地址编号）
        //reference types are used by a reference, a reference holds a reference or an address to the object, not the
        // object itself, we use the reference to control the memory, and we cannot access the object directly.
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        //🔼 we got 2 references pointing to the same array in memory. (hold the same address)

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); //toString prints the content of the array.
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        //after reference method
        //anotherArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
    }

    //reference methods
    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1,2,3,4,5}; //这是de-reference，意思是原来的reference已经不是对应原来的array，而是新的array，所以原来的array不受影响
    }
}
