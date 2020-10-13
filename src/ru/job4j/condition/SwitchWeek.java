package ru.job4j.condition;

public class SwitchWeek {
    public static String dayName(int day) {
        String days;
        switch (day) {
            case 1 :
                days = "Monday";
                break;
            case 2 :
                days = "Tuesday";
                break;
            case 3 :
                days = "Wednesday";
                break;
            case 4 :
                days = "Thersday";
                break;
            case 5 :
                days = "Friday";
                break;
            case 6 :
                days = "Saturday";
                break;
            case 7 :
                days = "Sunday";
                break;
            default:
                days = "Error";
                break;
        }
        return days;
    }

    public static void main(String[] args) {
        String day = dayName(17);
        System.out.println(day);
    }
}
