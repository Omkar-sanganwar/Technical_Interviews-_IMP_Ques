package com.sep27;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacters {
    public static void main(String[] args) {
        String str = "Programming";
        Map<Character, Integer> characterCount = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            characterCount.put(ch, characterCount.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Distinct characters and their count: " + characterCount);
    }
}
