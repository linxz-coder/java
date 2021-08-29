package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break; //you can choose whether or not to use "break" here, both are fine.
        }

        //------------challenge-------------------
        char character = 'A';
        switch (character){
//            case 'A':
//                System.out.println("A");
//                break;
//            case 'B':
//                System.out.println("B");
//                break;
//            case 'C':
//                System.out.println("C");
//                break;
//            case 'D':
//                System.out.println("D");
//                break;
//            case 'E':
//                System.out.println("E");
//                break;
            case 'A': case 'B': case 'C': case'D': case'E':
                System.out.println("A,B,C,D or E");
                break;
            default:
                System.out.println("Not found");
        }

//        乱写大小写，使用toLowerCase()
        String month = "JANUARy";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }

        printDayOfTheWeek(-1);
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
