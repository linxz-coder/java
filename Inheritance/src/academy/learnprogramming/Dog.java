package academy.learnprogramming;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

//    public Dog(String name, int brain, int body, int size, int weight) {
//        super(name, brain, body, size, weight);
//    }

    //initiate the super class with default values
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called.");
    }

    //override a method
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called.");
        //此处亦可用move(5); super不会被override的method影响
        super.move(5);

    }

    public void run() {
        System.out.println("Dog.run() called.");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(speed);
        super.move(speed);
    }
}
