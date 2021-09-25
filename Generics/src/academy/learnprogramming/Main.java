package academy.learnprogramming;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        //int 这里应为Integer，java自动为我们转化了
        for(int i : n) {
            System.out.println(i * 2);
        }
    }
}
