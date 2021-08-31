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
        for(int i = 0; i <= 10; i++) {
            //autoboxing: convert a primitive type(int) to a class/object
            //Integer.valueOf(i)
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i = 0; i <= 10; i++) {
            //unboxing: convert a class/object to a primitive type(int)
            //intArrayList.get(i).intValue()
            System.out.println(i + "--> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; //实际上发生的是Integer myIntValue = Integer.valueOf(56), 在unboxing
        int myInt = myIntValue; //实际上发生的是int myInt = myIntValue.intValue()

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            //这里也可以直接add(dbl)，java会autoboxing，直接把double dbl转化为class Double
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for(int i = 0; i < myDoubleValues.size(); i++) {
            //这里也可以直接double value = myDoubleValues.get(i), java会unboxing，直接把class myDoubleValues.get(i)转化为double,
            // 即primitive type
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }


    }
}
