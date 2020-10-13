package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String day) {
        return switch (day) {
           case "Понедельник", "Mondey" -> 1;
           case "Вторник", "Thuesday" -> 2;
           case "Среда", "Wednesday" -> 3;
           case "Четверг", "Thersday" -> 4;
           case "Пятница", "Friday" -> 5;
           case "Суббота", "Saturday" -> 6;
           case "Воскресенье", "Sunday" -> 7;
           default -> 0;
       };

    }

    public static void main(String[] args) {
        int day = MultipleSwitchWeek.numberOfDay("Sunday");
        System.out.println(day);

    }
}
