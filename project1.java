package suchithra;

import java.util.Scanner;

//defining c lass
    class Calculator {
    double a, b;

   // constructor to initialize oobjects
    Calculator (double a, double b) {
        this.a = a;
        this.b = b;
    }

    double calculation(String s) {
        switch (s.toLowerCase()) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                return b != 0 ? a / b : Double.NaN;
            default:
                System.out.println("Invalid operation.");
                return Double.NaN;
        }
    }
}

public class project1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        double a = sc.nextDouble();
        System.out.print("Enter b value: ");
        double b = sc.nextDouble();
        System.out.print("Enter calculation (add, subtract, multiply, divide): ");
        String s = sc.next();

        Calculator calc = new Calculator(a, b);
        System.out.println("Result: " + calc.calculation(s));
    }
}
