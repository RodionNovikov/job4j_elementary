package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number > 1;
        for (int index = 2; index <= number; index++) {
             if (number % 2 == 0) {
                 prime = false;
                 break;
             } else if (number % number == 0) {
                 prime = true;
             }
                }
        return prime;
    }
}
