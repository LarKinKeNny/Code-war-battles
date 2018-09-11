package com.kenny;

public class ASum {

    public static long findNb(long m) {
        int level = 0;
        long volume;
        long numberOfCubes = 0;
        while(m > numberOfCubes){
            level++;
            volume = (long) Math.pow(level,3);
            numberOfCubes +=volume;
        }

        if(numberOfCubes == m) return level;
        return -1;
    }
}

//Recursive Solution (Not working in codewars compiler)
//public class ASum {
//    private static long numberOfCubes = 0;
//    private static long level = 0;
//    private static long initialM = 0;
//
//
//    public static long findNb(long m) {
//        if(level == 0) initialM = m;
//        if(m > 0){
//            level++;
//            long volume = (long) Math.pow(level,3);
//            numberOfCubes += volume;
//            findNb(m - volume);
//        }
//
//        if(numberOfCubes == initialM ){
//            return level;
//        }
//        return -1;
//
//    }
//}

//       Your task is to construct a building which will be a pile of n cubes.
//        The cube at the bottom will have a volume of n^3, the cube above
//        will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.
//
//        You are given the total volume m of the building. Being given m can
//        you find the number n of cubes you will have to build?
//
//        The parameter of the function findNb (find_nb, find-nb, findNb) will
//        be an integer m and you have to return the integer n such as
//        n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.