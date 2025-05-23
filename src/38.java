package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to input integer values
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Perform calculations using Java's Math class
        int sum = num1 + num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2;
        
        // Display the results of the calculations
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);
    }
}
