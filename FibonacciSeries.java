package com.sep27;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int first = 0, second = 1;
        
        System.out.print("Fibonacci series: " + first + ", " + second);
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
