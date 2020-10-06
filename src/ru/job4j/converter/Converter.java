package ru.job4j.converter;

public class Converter {
    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static void main(String[] args) {
        int in = 120;
        int expected = 2;
        int out = Converter.rubleToDollar(in);
        int out2 = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        boolean passed2 = expected == out2;
        System.out.println("120 rubles are 2 dollars. Test result :" + passed);
        System.out.println("120 rubles are 2 euros. Test result :" + passed2);

    }
}

