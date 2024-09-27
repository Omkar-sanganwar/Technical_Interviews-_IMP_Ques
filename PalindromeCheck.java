package com.sep27;

public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 121, reversed = 0, original = number;
        
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        System.out.println(original + " is palindrome: " + (original == reversed));
    }
}
