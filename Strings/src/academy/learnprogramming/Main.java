package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2019"; //\u00A9 is a copyright sign of unicode
        System.out.println("myString is equal to " + myString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
        //note that strings are immutable, java just create a new string if you append values to the string.



    }
}
