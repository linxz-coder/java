package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0; //or without the flag, you can set min = Integer.MIN_VALUE; max = Integer.MAX+VALUE
        // (因为是最大最小值，所以userInput总是能够大于或者小于它们）
        int max = 0;
        boolean first = true; // a flag to show if the game started, and set the initial values

        while(true){
            System.out.println("Enter number: ");

            boolean isInt = scanner.hasNextInt();

            if(isInt){
                int userInput = scanner.nextInt();

                if(first){
                    first = false;
                    max = userInput;
                    min = userInput;
                }

                if(userInput > max){
                    max = userInput;
                }

                if(userInput < min){
                    min = userInput;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle input

        }

        System.out.println("The maximal number is " + max);
        System.out.println("The minimal number is " + min);
        scanner.close();

    }
}
