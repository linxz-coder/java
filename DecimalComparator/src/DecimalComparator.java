public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int comparator1 = (int)(num1 * 1000);
        int comparator2 = (int)(num2 * 1000);
        if (comparator1 == comparator2){
            return true;
        }
        return false;
    }
}
