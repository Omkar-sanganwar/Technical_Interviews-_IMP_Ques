package com.sep27;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "  Java    Programming   ";
        String trimmed = str.replaceAll("\\s+", "");
        System.out.println("String without whitespaces: " + trimmed);
    }
}

