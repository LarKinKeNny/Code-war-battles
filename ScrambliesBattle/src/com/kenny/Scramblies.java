package com.kenny;


public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        int[] stringDiff = new int[26];
        int[] str1Sum = countLowerCase(str1);
        int[] str2Sum = countLowerCase(str2);
        for(int a = 0; a < 26; a++){
            stringDiff[a] = str1Sum[a] - str2Sum[a];
            if(stringDiff[a] < 0) return false;
        }
        return true;
    }

    private static int[] countLowerCase(String str){
        int[] alphaCount = new int[26];
        for (int i = 0; i < str.length(); i++){
            alphaCount[Character.getNumericValue(str.charAt(i)) - 10]++;
        }
        return alphaCount;
    }
}
//too slow
//import java.util.ArrayList;
//import java.util.List;
//
//public class Scramblies {
//
//    public static boolean scramble(String str1, String str2) {
//        int str1Length = str1.length();
//        int str2Length = str2.length();
//        if(str1Length < str2Length) return false;
//        boolean found = false;
//        List<Integer> skipIndex = new ArrayList<>();
//        for(int i = 0; i < str2Length; i++){
//            for(int j = 0; j < str1Length; j++){
//                if(str1.charAt(j) == str2.charAt(i) && !skipIndex.contains(j)) {
//                    found = true;
//                    skipIndex.add(j);
//                    break;
//                }
//            }
//            if(!found) return false;
//            found = false;
//        }
//        return true;
//    }
//}
//        Complete the function scramble(str1, str2) that returns
//        true if a portion of str1 characters can be rearranged to match
//        str2, otherwise returns false.
//
//        Notes:
//
//        Only lower case letters will be used (a-z). No punctuation or digits will be included.
//        Performance needs to be considered
//        Examples
//        scramble('rkqodlw', 'world') ==> True
//        scramble('cedewaraaossoqqyt', 'codewars') ==> True
//        scramble('katas', 'steak') ==> False