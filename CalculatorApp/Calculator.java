package CalculatorApp;
// calculator class that takes two values from the user and let's the user choose the operation: add, subtract, multiply, divide

public class Calculator {
    // private variables
    private double value1;
    private double value2;
    private int selections;
    private double result;

    public Calculator() {
        // default constructor
        this.value1 = 0;
        this.value2 = 0;
        this.selections = 0;
        this.result = 0;
    }

    // setters -> setting the values for the variables
    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setSelections(int selections) {
        this.selections = selections;
    }

    // getters -> getting the values for the variables
    public double getValue1() {
        return this.value1;
    }

    public double getValue2() {
        return this.value2;
    }

    public int getSelections() {
        return this.selections;
    }

    public double setResult() {
        switch (this.selections) {
            case 1:
                this.result = this.value1 + this.value2;
                break;
            case 2:
                this.result = this.value1 - this.value2;
                break;
            case 3:
                this.result = this.value1 * this.value2;
                break;
            case 4:
                if (this.value2 == 0){
                    System.out.println("Cannot divide by zero");
                    break;
                }
                this.result = this.value1 / this.value2;
                break;
            default:
                this.result = 0;
                break;
        }

        return this.result;
    }

    public double getResult(double result) {
        return this.result;
    }
}