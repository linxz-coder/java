package academy.learnprogramming;

// for(init; termination; increment){}

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 0.02));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        //interestRate from 2 to 8
        for (int interestRate = 2; interestRate < 9; interestRate++) {
            System.out.println("10,000 at " + interestRate + " % interest = " + String.format("%.2f",
                    calculateInterest(10000.0, interestRate)));
        }

        //interestRate from 8 to 2
        for (int interestRate = 8; interestRate > 1; interestRate--) {
            System.out.println("10,000 at " + interestRate + " % interest = " + String.format("%.2f",
                    calculateInterest(10000.0, interestRate)));
        }

        int count = 0;
        for(int i=1; i<=100; i++){
            if(isPrime(i)){
                count ++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }

    //calculate the interest
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    //检查质数/素数 prime numbers
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        //从n的一半之前检查，可以减少检查的数量
//        for(int i=2; i <= (long) Math.sqrt(n); i++){} //用更少时间
        for(int i=2; i <= n/2; i++){
            System.out.println("Looping " + i); //检查用的次数
            if (n % i == 0){
                return false;
            }
        }

        return true;
    }

    //prime numbers list: https://primes.utm.edu/lists/small/1000.txt
}
