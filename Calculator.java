import java.util.*;
public class Calculator {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        System.out.println("Enter first number: ");
        num1 = sc.nextDouble();
        System.out.println("Enter second number: ");
        num2 = sc.nextDouble();
        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
    } 
} 
