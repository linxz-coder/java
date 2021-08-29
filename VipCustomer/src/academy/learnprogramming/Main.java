package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        VipCustomer tim = new VipCustomer();
        System.out.println(tim.getName());

        VipCustomer kelly = new VipCustomer("Kelly", 100.0, "Kelly@gmail.com");
        System.out.println(kelly.getName());

        VipCustomer lucy = new VipCustomer("Lucy", 200.0);
        System.out.println(lucy.getEmail());
    }
}
