package com.sep27;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153; // Change number to test other values
        int originalNumber = number, remainder, result = 0;
        
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        System.out.println(number + " is an Armstrong number: " + (result == number));
    }
}
