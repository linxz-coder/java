package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        float myFloatValue2 = (float) 5.25;
        double myDoubleValue = 5d / 3d;
        double myDoubleValue2 = 5.00 / 3.00; //double is the default type for decimal
        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);

        //--------------challenge------------------
        double pounds = 1.23532d;
        double poundsToKilo = pounds * 0.45359238d;
        System.out.println(poundsToKilo);
    }
}
