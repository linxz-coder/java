package academy.learnprogramming;

import java.util.Scanner; //在intelliJ,输入Scanner会自动出现

public class Main {

    public static void main(String[] args) {
        //Scanner is a build-in class which allows us to read user input
        //scanner is the instance of the Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        //scanner parsed the string to integer for us, so we use nextInt() instead of nextLine()

        boolean hasNextInt = scanner.hasNextInt();

        //check if the string can be parsed into an integer
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); //handle next line character (enter key)

            System.out.println("Enter your name: ");
            //read the next line of scanner
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            //make sure the user type the right birth year
            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }



        //when you finish using scanner, you should close it.
        scanner.close();
    }
}
