package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("NUmberAsString= " + numberAsString);

        //parseInt is a method to parse a string to an integer
        int number = Integer.parseInt(numberAsString);
        //parseDouble is a method to parse a string to a double
        //Double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;
        System.out.println(numberAsString);
        System.out.println(number);
    }
}
