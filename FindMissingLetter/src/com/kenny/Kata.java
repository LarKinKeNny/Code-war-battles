package com.kenny;


public class Kata
{
    public static char findMissingLetter(char[] array)
    {
        for (int i = 0; i < array.length - 1; i++) {
            char temp1 = array[i];
            char temp2 = array[i + 1];
            if ((int) temp2 - (int) temp1 != 1) {
                return (char) ((int) temp1 + 1);
            }
        }
        return ' ';
    }
}