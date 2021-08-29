package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        //运行顺序 i = 0 ; j = 0,1,2,3,4,5.....
        //运行顺序 i = 1 ; j = 0,1,2,3,4,5.....
        //运行顺序 i = 2 ; j = 0,1,2,3,4,5.....
        int res = 0;
        for(int i = 0; i <= smallCount; i++){
            for (int j = 0; j <= bigCount; j++) {
                res = j * 5 + i;
                if(res == goal){
                    return true;
                }
            }
        }

        return false;

    }
}
