public class Main {
    public static void main(String[] args) {
        boolean year1 = LeapYear.isLeapYear(-1600);
        boolean year2 = LeapYear.isLeapYear(1600);
        boolean year3 = LeapYear.isLeapYear(2017);
        boolean year4 = LeapYear.isLeapYear(2000);
        boolean year5 = LeapYear.isLeapYear(1700);
        boolean year6 = LeapYear.isLeapYear(1800);
        boolean year7 = LeapYear.isLeapYear(1900);
        boolean year8 = LeapYear.isLeapYear(2400);
        boolean year9 = LeapYear.isLeapYear(2100);
        boolean year10 = LeapYear.isLeapYear(2200);
        System.out.println(year1);
        System.out.println(year2);
        System.out.println(year3);
        System.out.println(year4);
        System.out.println(year5);
        System.out.println(year6);
        System.out.println(year7);
        System.out.println(year8);
        System.out.println(year9);
        System.out.println(year10);
    }
}
