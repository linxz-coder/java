package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    numberToWords(123);
    }

    public static void numberToWords(int number){

        int reverseNumber = reverse(number);

        if (reverseNumber < 0){
            System.out.println("Invalid Value");
        }

        if (reverseNumber == 0){
            System.out.println("Zero");
        }

        String output = "";
        while(reverseNumber > 0){
            String digitString = "";
            int digit = reverseNumber % 10;
            switch (digit){
                case 0:
                    digitString = "Zero ";
                    break;
                case 1:
                    digitString = "One ";
                    break;
                case 2:
                    digitString = "Two ";
                    break;
                case 3:
                    digitString = "Three ";
                    break;
                case 4:
                    digitString = "Four ";
                    break;
                case 5:
                    digitString = "Five ";
                    break;
                case 6:
                    digitString = "Six ";
                    break;
                case 7:
                    digitString = "Seven ";
                    break;
                case 8:
                    digitString = "Eight ";
                    break;
                case 9:
                    digitString = "Nine ";
                    break;
                default:
                    digitString = "error";
            }

            reverseNumber /= 10;
            output += digitString;
        }


        for (int i = getDigitCount(reverse(number)); i<getDigitCount(number); i++){
            output += "Zero ";
        }

        System.out.println(output);
    }

    public static int reverse(int number){

        int reverse = 0;
        int stored = number;

        while(stored != 0){
            int lastDigit = stored % 10;
            reverse = (reverse * 10) + lastDigit;
            stored /= 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }

        int count = 1;
        while(number > 9){
            count++;
            number /= 10;
        }

        return count;
    }
}
