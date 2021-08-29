package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                sum += i;
                System.out.println("The number can be divided with both 3 and 5 = " + i);
                count++;
            }

            if (count == 5){
                System.out.println("The current total sum of the 5 numbers is = " + sum);
                break;
            }
        }
    }
}
