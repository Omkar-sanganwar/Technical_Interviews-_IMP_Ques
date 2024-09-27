package com.sep27;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped values: a = " + a + ", b = " + b);
    }
}

