package academy.learnprogramming;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        /* how to declare an array */
        String[] strArray = new String[5];
        int[] intArray = new int[10];

        /* how to declare an ArrayList, <> need to be a class */
        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        /* cannot use ArrayList<int>, because int is a primitive type, not a class */
        //ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        /* another way: Integer is a class */
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
    }
}
