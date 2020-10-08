package ru.job4j.condition;

public class Cinema {

    public static void access(int age) {
        System.out.println("The age of customer is" + age);
        if (age >= 18) {
            System.out.println("Welcome on bord");
        } else {
            System.out.println("Go home baby");

        }
    }

    public static void main(String[] args) {
            access(15);
            access(21);

    }
}

