package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(30,11));
    }

//    public static int getGreatestCommonDivisor(int first, int second){
//        if (first < 10 || second < 10){
//            return -1;
//        }
//
//        int divisor = 0;
//        if(first < second){
//            for(int i=1; i<=first; i++){
//                if (first % i == 0 && second % i == 0){
//                    divisor = i;
//                } else {
//                    continue;
//                }
//            }
//        } else {
//            for(int i=1; i<=second; i++){
//                if (first % i == 0 && second % i == 0){
//                    divisor = i;
//                } else {
//                    continue;
//                }
//            }
//        }
//        return divisor;
//    }
    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }
        return second;
    }

}
