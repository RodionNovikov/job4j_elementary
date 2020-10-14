package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int a = start; a <= finish; a++) {
            sum = sum + a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(45, 60));
        System.out.println(sum(2, 9));
        System.out.println(sum(7, 16));
        System.out.println(sum(9, 12));
        System.out.println(sum(1, 2));
        System.out.println(sum(78, 86));
    }
}
