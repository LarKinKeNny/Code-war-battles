package com.kenny;

public class Matrix {
    public static int determinant(int[][] matrix) {
        int size = matrix.length, det = 0;
        if (size == 1) return matrix[0][0];
        if(size == 2){
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }
        else{
            int [][] newMatrix = new int[size -1][size -1];
            int m , n, j = 0;
            for(int i = 0; i < size ; i++){
                m = -1;
                for(int k = 0; k < size  ; k++){
                    if( k!= i) m++;
                    n = 0;
                    for (int l = 0; l < size ; l++) {
                        if (j != l && k!=i) {
                            newMatrix[m][n] = matrix[k][l];
                            n++;
                        }
                    }
                }
                if((i%2 != 0) && (i%2 != j%2)) {
                    det -= matrix[i][j]*determinant(newMatrix);
                }else{
                    det += matrix[i][j]*determinant(newMatrix);
                }
            }
        }
        return det;
    }
}
//ad - bc
//    The determinant of larger matrices are calculated analogously,
//    e.g. if M is a 4x4 matrix with first row [a, b, c, d], det(M) = a * det(a_minor)
//     - b * det(b_minor) + c * det(c_minor) - d * det(d_minor)