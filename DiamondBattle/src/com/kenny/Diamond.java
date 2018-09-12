package com.kenny;

class Diamond {
    public static String print(int n) {
        if(n%2 == 0 || n < 0) return null;
        StringBuilder sb = new StringBuilder();
        int half = (n+1)/2;
        for(int i = 0; i < n; i++){
            if( i < half) {
                for(int k = 0; k < (half - 1) - i ; k++){
                    sb.append(" ") ;
                }
                for (int j = 0; j < (1 + (i*2)) ; j++) {

                    sb.append("*");
                }
                sb.append("\n");
            }else{
                for(int k = 0; k < i - (half - 1)  ; k++){
                    sb.append(" ") ;
                }
                for (int j = 1 ; j < ((n - i)*2) ; j++ ) {

                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}