package academy.learnprogramming;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        //testing all the lowercase cases
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model; //this. 区分了attribute 和 parameter
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}
