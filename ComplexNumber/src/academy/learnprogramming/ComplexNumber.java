package academy.learnprogramming;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return this.real; //这里是this.real，不是real
    }

    public double getImaginary() {
        return this.imaginary; //这里是this.imaginary，不是imaginary
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber){
       add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber){
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
}
