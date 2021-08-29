package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(SumDigits(188));
        System.out.println(SumDigits(-1));
        System.out.println(SumDigits(1888));
        System.out.println(SumDigits(12));
        System.out.println(SumDigits(8));
        System.out.println(SumDigits(100));

    }

    public static int SumDigits(int number){
        int sum = 0;
        if(number >= 10){
            //125 -> 125 / 10 = 12...5
            while (number > 0){
                //extract the least-significant digit
                int digit = number % 10;
                sum += digit;

                // drop the least-significant digit
                number /= 10; //int number 1/10 = 0
            }
            return sum;
        }
        return -1;
    }
}
