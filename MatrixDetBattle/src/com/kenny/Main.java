package com.kenny;

public class Main {

    public static void main(String[] args) {
        int[][] a = {{1}};
        int[][] b = {{1, 3}, {2,5}};
        int[][] c = {{2,5,3}, {1,-2,-1}, {1, 3, 4}};
        int[][] d = {{1,5,3}, {2,4,7}, {4, 6, 2}};
        //System.out.println(Matrix.determinant(a));
        //System.out.println(Matrix.determinant(b));
        System.out.println(Matrix.determinant(d));
    }
}
