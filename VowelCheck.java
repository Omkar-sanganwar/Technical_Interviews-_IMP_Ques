package com.sep27;

public class VowelCheck {
    public static void main(String[] args) {
        String str = "Java Programming";
        boolean hasVowel = str.matches(".*[AEIOUaeiou].*");
        System.out.println("Contains vowel: " + hasVowel);
    }
}

