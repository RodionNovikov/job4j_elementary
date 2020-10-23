package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean b = data[0];
        for (boolean value : data) {
            if (b == !value) {
                result = false;
                break;

            }

        }
        return result;
    }
}
