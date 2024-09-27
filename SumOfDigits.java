package com.sep27;

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
