package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    int count = 0;
	    while(count != 5){
            System.out.println("Count Value is " + count);
            count++;
        }

	    //同样的结果，for loop来表达
//        for(count=0; count<5; count++) {
//            System.out.println("Count Value is " + count);
//        }

        //while loop
//        count = 1;
//	    while(true){
//	        if(count == 6) {
//	            break;
//            }
//            System.out.println("Count value is " + count);
//	        count++;
//        }

        //do while loop
//        count = 1;
//	    do {
//            System.out.println("Count value was " + count);
//            count ++;
//        } while(count!=6);

        int number = 4;
	    int finishNumber = 20;
	    int countNum = 0;
	    while (number <= finishNumber) {
	        number ++;
	        if(!isEvenNumber(number)) {
	            continue;
            } else {
	            countNum++;
            }

            System.out.println("Even number " + number);

	        if (countNum >= 5){
                System.out.println("The total even numbers found was " + countNum);
	            break;
            }

        }
    }

    public static boolean isEvenNumber(int num) {
       return num % 2 == 0;
    }
}
