package com.kenny;

public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] charactersInString = dna.toCharArray();
        int counter = 0;
        for(char character : charactersInString){
            if(charactersInString[counter] == 'A'){
                charactersInString[counter] =  'T';
            }else if(charactersInString[counter] == 'T'){
                charactersInString[counter] = 'A';
            }else if(charactersInString[counter] == 'C'){
                charactersInString[counter] = 'G';
            }else if(charactersInString[counter] == 'G') {
                charactersInString[counter] = 'C';
            }
            counter++;
        }
        return new String(charactersInString);
    }
}