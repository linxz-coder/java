package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        House blueHouse = new House("blue");
        House anotherHouse = blueHouse;
        //House anotherHouse = new House("blue"); 这样写得话是两个objects

        System.out.println(blueHouse.getColor()); //blue
        System.out.println(anotherHouse.getColor()); //blue

        anotherHouse.setColor("yellow");
        System.out.println(blueHouse.getColor()); //yellow
        System.out.println(anotherHouse.getColor()); //yellow

        House greenHouse = new House("green");
        anotherHouse = greenHouse;

        System.out.println(blueHouse.getColor()); //yellow
        System.out.println(greenHouse.getColor()); //green
        System.out.println(anotherHouse.getColor()); //green
    }
}
