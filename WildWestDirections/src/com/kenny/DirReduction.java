package com.kenny;

//public class DirReduction {
//    public static String[] dirReduc(String[] arr) {
//        int horizontal = 0;
//        int vertical = 0;
//        for(String word : arr){
//            switch(word){
//                case "NORTH":
//                    vertical++;
//                    break;
//                case "SOUTH":
//                    vertical--;
//                    break;
//                case "EAST":
//                    horizontal++;
//                    break;
//                case "WEST":
//                    horizontal--;
//                    break;
//            }
//        }
//        int absHorizontalCounter = Math.abs(horizontal);
//        int absVerticalCounter = Math.abs(vertical);
//        int sum = absHorizontalCounter + absVerticalCounter;
//        String[] finalString = new String[sum];
//        System.out.println(vertical);
//        System.out.println(horizontal);
//        for(int h = 0; h < absHorizontalCounter; h++) {
//            if(horizontal > 0){
//                finalString[h] = "EAST";
//            }else{
//                finalString[h] = "WEST";
//            }
//        }
//        for(int v = absHorizontalCounter; v < sum; v++) {
//            if(vertical > 0){
//                finalString[v] = "NORTH";
//            }else{
//                finalString[v] = "SOUTH";
//            }
//        }
//        return finalString;
//    }
//}

public class DirReduction {
    private static int staticCounter = 0;
    public static String[] dirReduc(String[] arr) {
        String [] firstString;
        if(arr.length != 0) {
            firstString = new String[arr.length];
        }else{
            return new String[] {};
        }
        int counter = 0;
        for(int i = 0 ; i < arr.length ; i++){
            try {
                if (!isOpposite(arr[i], arr[i + 1])) {
                    firstString[counter] = arr[i];
                    counter++;
                } else {
                    i++;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                firstString[counter] = arr[i];
                counter++;
            }
        }

        String[] finalString = new String[counter];
        for (int i = 0; i < counter; i++){
            finalString[i] = firstString[i];
        }
        staticCounter++;
        if(staticCounter <= arr.length + 1){
            finalString = dirReduc(finalString);
        }
        return finalString;
    }

    private static boolean isOpposite(String one, String two){
        if(one.equals("NORTH") && two.equals("SOUTH")){
            return true;
        }
        if(one.equals("SOUTH") && two.equals("NORTH")){
            return true;
        }
        if(one.equals("EAST") && two.equals("WEST")){
            return true;
        }
        if(one.equals("WEST") && two.equals("EAST")){
            return true;
        }
        return false;
    }
}