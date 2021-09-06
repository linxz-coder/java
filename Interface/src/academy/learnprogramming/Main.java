package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        ITelephone timesPhone;
        timesPhone = new DeskPhone(123456);
        timesPhone.powerOn();
        timesPhone.callPhone(123456);
        timesPhone.answer();
    }
}
