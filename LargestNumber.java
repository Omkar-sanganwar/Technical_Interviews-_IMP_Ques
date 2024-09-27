package com.sep27;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};
        int largest = arr[0];
        
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest number: " + largest);
    }
}
