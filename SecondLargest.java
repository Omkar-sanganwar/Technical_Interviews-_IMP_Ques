package com.sep27;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1};
        Arrays.sort(arr);
        System.out.println("Second largest number: " + arr[arr.length - 2]);
    }
}

