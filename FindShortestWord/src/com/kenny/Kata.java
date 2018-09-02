package com.kenny;

public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortest = Integer.MAX_VALUE;
        for(String word : words){
            if(word.length() < shortest){
                shortest = word.length();
            }
        }
        return shortest;
    }
}