//Write a program to Menu driven program using switch statement ( Find addition, subtraction, multiplication and division of to integer numbers )
//Bikram Koley


package com.assignment;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Display the menu of options
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        // Get the user's Option
        System.out.print("Select your choice (1-4): ");
        int Option = input.nextInt();

        // Perform the selected operation using a switch statement
        switch (Option) {
        
            case 1:
                // Addition
                System.out.print("Enter the first number: ");
                int a = input.nextInt();
                System.out.print("Enter the second number: ");
                int b = input.nextInt();
                int sum = a + b;
                System.out.println("The sum is: " + sum);
                break;
                
            case 2:
                // Subtraction
                System.out.print("Enter the first number: ");
                int c = input.nextInt();
                System.out.print("Enter the second number: ");
                int d = input.nextInt();
                int Sub = c - d;
                System.out.println("The Subtraction is: " + Sub);
                break;
                
            case 3:
                // Multiplication
                System.out.print("Enter the first number: ");
                int m = input.nextInt();
                System.out.print("Enter the second number: ");
                int n = input.nextInt();
                int Multiplication = m * n;
                System.out.println("The Multiplication is: " + Multiplication);
                break;
                
            case 4:
                // Division
                System.out.print("Enter the first number: ");
                int x = input.nextInt();
                System.out.print("Enter the second number: ");
                int y = input.nextInt();
                int Division = x / y;
                System.out.println("The Division is: " + Division);
                break;
                
            default:
            	//By Default Value
                System.out.println("Invalid Option!");
                System.out.println("Enter a Valid Option");
                break;
        }

        // Close the Scanner object
        input.close();
    }
}
