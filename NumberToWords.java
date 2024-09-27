package com.sep27;

public class NumberToWords {
    public static void main(String[] args) {
        int number = 240;
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        
        String result = "";
        while (number != 0) {
            int digit = number % 10;
            result = words[digit] + " " + result;
            number /= 10;
        }
        System.out.println("Number in words: " + result.trim());
    }
}

