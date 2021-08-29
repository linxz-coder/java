package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Camry camry = new Camry(36);
        camry.steer(45);
        camry.accelerate(30);
        camry.accelerate(20);
        camry.accelerate(-42);
    }
}
