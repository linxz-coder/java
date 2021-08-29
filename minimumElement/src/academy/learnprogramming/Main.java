package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine(); // handle the next "enter" key，否则可能有错误

        int[] myArray = readIntegers(count);
        System.out.println("min = " + findMin(myArray));
    }

    public static int[] readIntegers(int count) {

        int[] array = new int[count];

        for(int i = 0; i < count; i++) {
            System.out.println("Enter a number: ");
            array[i] = scanner.nextInt();
            scanner.nextLine(); // handle the next "enter" key，否则可能有错误
        }

        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
