package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        //porsche.model = "Carrera";
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        //porsche.setModel("911"); //output: "Model is Unknown"
        System.out.println("Model is " + porsche.getModel());
    }
}
