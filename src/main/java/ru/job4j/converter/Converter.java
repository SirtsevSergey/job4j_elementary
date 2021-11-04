package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = 60 * value;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = 70 * value;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dolar.");
        float rubleeuro = Converter.euroToRuble(140);
        System.out.println("140 euro are " + rubleeuro + " ruble.");
        float rubledollar = Converter.dollarToRuble(140);
        System.out.println("140 dollar are " + rubledollar + " ruble.");
    }

      }

