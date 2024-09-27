package com.sep27;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 29; // Change number to test other values
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(number + " is prime: " + isPrime);
    }
}
