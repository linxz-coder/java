package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printSquareStar(6);
    }

    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        } else{
            for(int i = 0; i < number; i++){
                for(int j = 0; j < number; j++){
                    if(i == 0 || i == number -1 ){
                        //print 不换行， println 换行
                        System.out.print("1");
                    }

                    else if(j == 0){
                        System.out.print("2");
                    }

                    else if(j == number - 1){
                        System.out.print("3");
                    }

                    else if(j == i){
                        System.out.print("4");
                    }

                    else if(j == number - 1 - i){
                        System.out.print("5");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }


    }


}
