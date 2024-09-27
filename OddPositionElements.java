package com.sep27;

public class OddPositionElements {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 9, 4}; // Sample array
        
        System.out.print("Elements on odd positions: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) { // 1st, 3rd, 5th... are considered "odd positions" in terms of 0-based index
                System.out.print(arr[i] + " ");
            }
        }
    }
}
