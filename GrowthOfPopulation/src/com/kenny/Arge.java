package com.kenny;

class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int population = p0;
        int years = 0;
        while(population < p){
            years++;
            population = (int) (population * percent / 100) + aug + population;
        }
        return years;
    }
}

//        In a small town the population is p0 = 1000 at the beginning of a year.
//        The population regularly increases by 2 percent per year and moreover 50
//        new inhabitants per year come to live in the town. How many years does the
//        town need to see its population greater or equal to p = 1200 inhabitants?