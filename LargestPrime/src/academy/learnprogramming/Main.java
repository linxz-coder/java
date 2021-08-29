package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        for (int n = 2; n < number; n++) {
            //若从2开始可以整除，则除到尽为止；同理3也是一样
            if (number % n == 0) {
                number /= n;
                n--; //若Number = 45, n = 3,因为这里n++,n=4, n--重新让 n变为3.
            }
        }
        return number;
    }




}
