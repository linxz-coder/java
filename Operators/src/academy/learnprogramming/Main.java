package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        result++;

        System.out.println(result); //result + 1

        result--;
        System.out.println(result); //result - 1

        result += 2;
        //result =+ 2 系统会认为是result = +2
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80;
        int sencodTopScore = 81;
        if ((topScore) > 90 || (sencodTopScore <= 90)) {
            System.out.println("It is true.");
        }

        //ternary operator
        boolean isCar = false;
        boolean wasCar = isCar ? true : false;

        //-------challenge----------
        double myValue = 20.00d;
        double secondValue = 80.00d;
        double sum = (myValue + secondValue) * 100d;
        double remainder = sum % 40.00d;
        System.out.println(remainder);
        boolean isRemainderZero = remainder == 0 ? true : false;
        System.out.println(isRemainderZero);

        if (remainder != 0) {
            System.out.println("Got some remainder.");
        }


    }
}
