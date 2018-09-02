package com.kenny;

public class JadenCase {

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if(phrase != null && phrase != "") {
            String[] words = phrase.split(" ");
            String sentence = "";
            int counter = 0;
            for (String word : words) {
                words[counter] = words[counter].substring(0, 1).toUpperCase() +
                        words[counter].substring(1).toLowerCase();
                if (counter != words.length - 1) {
                    sentence += words[counter] + " ";
                } else {
                    sentence += words[counter];
                }
                counter++;
            }
            return sentence;
        }
        return null;
    }
}