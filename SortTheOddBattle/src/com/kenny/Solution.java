package com.kenny;

public class Solution {
    public static int[] sortArray(int[] numberArray){
        if(numberArray.length == 0) return numberArray;
        int counter1 = 0, counter2 = 1;
        for(int i = 0; i < numberArray.length; i++) {

            while (counter1 < numberArray.length && numberArray[counter1] % 2 == 0) {
                counter1++;
            }

            while (counter2 < numberArray.length  && numberArray[counter2] % 2 == 0) {
                counter2++;
            }

            if (numberArray[counter1] > numberArray[counter2]) {
                int temp = numberArray[counter1];
                numberArray[counter1] = numberArray[counter2];
                numberArray[counter2] = temp;
            }
            if(counter1 < numberArray.length - 3 && counter2 < numberArray.length - 2){
                counter1++;
                counter2++;

            }else{
                counter1 = 0;
                counter2 = 1;
            }
        }
        return numberArray;
    }
}
//        You have an array of numbers.
//        Your task is to sort ascending odd numbers but even numbers must be on their places.
//
//        Zero isn't an odd number and you don't need to move it.
//        If you have an empty array, you need to return it.
//
//        Example
//
//        sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
