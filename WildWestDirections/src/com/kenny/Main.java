package com.kenny;

public class Main {

    public static void main(String[] args) {
        String[] directions = DirReduction.dirReduc(new String[] {"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"});
        for(String word: directions){
            System.out.print(word + " ");
        }
    }
}
