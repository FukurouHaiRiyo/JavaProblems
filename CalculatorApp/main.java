package CalculatorApp;
import java.util.Scanner;
public class main {
    public static void Main(String[] args) {
        // create a new instance of the calculator class
        Calculator calc = new Calculator();
        // get value1 from user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value1: ");
        calc.setValue1(input.nextDouble());
        
        // get value2 from user input
        System.out.println("Enter value2: ");
        calc.setValue2(input.nextDouble());

        // get selections from user input
        System.out.println("Enter selection:\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\nSelection");
        calc.setSelections(input.nextInt());

        // print the result
        System.out.println("Result: " + calc.setResult());

        // print the values
        System.out.println("Value1: " + calc.getValue1());
        System.out.println("Value2: " + calc.getValue2());
        System.out.println("Selection: " + calc.getSelections());
        System.out.println("Result: " + calc.getResult(calc.setResult()));

        // close the scanner
        input.close();
    }
}
