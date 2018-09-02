package com.kenny;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int vertical = 0;
        int horizontal = 0;
        int time = 0;
        if(walk.length > 10) return false;
        for(char a: walk) {
            switch (a) {
                case 'n':
                    vertical++;
                    break;
                case 's':
                    vertical--;
                    break;
                case 'o':
                    horizontal++;
                    break;
                case 'w':
                    horizontal--;
            }
            time++;
        }
        return (time == 10 && horizontal == 0 && vertical == 0);
    }
}
