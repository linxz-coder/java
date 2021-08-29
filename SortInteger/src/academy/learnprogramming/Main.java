package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Please enter " + capacity + " integers: \r");
        int[] array = new int[capacity];

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        //1.copy the array
//        int[] sortedArray = new int[array.length];
//        for(int i=0; i< array.length; i++){
//            sortedArray[i] = array[i];
//        }

        //the first parameter is the array, the second parameter is the length that you want to copy
        int[] sortedArray = Arrays.copyOf(array, array.length);


        //2.sort the array
        int temp;
        for(int i = 0; i < sortedArray.length - 1; i++) {
            for (int m = i + 1; m < sortedArray.length; m++) {
                if(sortedArray[i] < sortedArray[m]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[m];
                    sortedArray[m] = temp;
                }
            }
        }

        return sortedArray;
    }
}
