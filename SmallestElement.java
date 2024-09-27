package com.sep27;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};
        int smallest = arr[0];
        
        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest element: " + smallest);
    }
}
