package com.kenny;

public class Main {

    public static void main(String[] args) {
	   int[] result = Solution.sortArray(new int[] { 5, 3, 2, 8, 1, 4, 9, 12, 15, 13, 10, 11, 14});
        for (int num: result) {
            System.out.print(num + " ");
        }
    }
}
