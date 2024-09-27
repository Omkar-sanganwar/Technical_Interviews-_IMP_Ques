package com.sep27;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Change number to test other values
        int factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}

