package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {

        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {

        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        short height = 1827;
=======
        short height = 187;
>>>>>>> origin/master
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 187 is " + woman);
    }

}