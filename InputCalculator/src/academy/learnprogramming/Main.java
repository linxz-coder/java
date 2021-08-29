package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while(true){
            boolean isInt = scanner.hasNextInt(); //必须放到while loop里面，因为每次都要查hasNextInt

            if(isInt){
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                scanner.nextLine();
                break;
            }
        }

        long avg = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
