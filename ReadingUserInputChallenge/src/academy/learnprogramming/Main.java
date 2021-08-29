package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1.initiate the scanner
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        //2.prompt the user to type something
        for(int num = 1; num <= 10; num++){
            System.out.println("Enter number #" + num + ": ");

            //3.check if nextInt is valid
            boolean nextInt = scanner.hasNextInt();
            if(nextInt){
                //4. get nextInt()
                int userInputNum = scanner.nextInt();
                sum += userInputNum;
            }else{
                System.out.println("Invalid Number");
                num--;

                //5. check what the nextLineOutput is
                String nextLineOutput = scanner.nextLine();
                System.out.println(nextLineOutput);
            }
        }

        System.out.println("The sum of your input is: " + sum);
        //6.close the scanner
        scanner.close();

    }
}
