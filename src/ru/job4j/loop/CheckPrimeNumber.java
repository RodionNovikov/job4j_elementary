package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = true;
        for (int index = -1; index <= 2; index++) {
             if (num == 1) {
                 prime = false;
                 break;
             }
             if (num % 2 == 0) {
                 prime = false;
                 break;
             } else if (num % 1 == 0) {
                 prime = true;
             }
                }
        return prime;
    }
}
