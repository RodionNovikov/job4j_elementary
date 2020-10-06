package ru.job4j.converter;

public class Converter {
    public static int rubleToDollar(int value) {
        int r = value / 60;
        return value / 60;
    }

    public static int rubleToEuro(int value) {
        int r = value / 70;
        return value / 70;
    }

    public static void main(String[] args) {
        int dollar = Converter.rubleToDollar(60);
        int euro = Converter.rubleToEuro(70);

        System.out.println("60 rubles are " + dollar + " dollar.");
        System.out.println("70 rubles are " + euro + "euro");
    }
}

