package com.sep27;

public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}

