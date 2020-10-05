package ru.job4j.condition;



public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
       double first =  Math.pow(a, 2);
       double second = Math.pow(b, 2);
       double third = first - second;
       double rsl = Math.sqrt(third);
       return rsl;

    }
    public static void main (String[] args){
        double result = Point.distance(5,4,10,8);
        System.out.println("result (5,4) to (10,8) " + result);

    }
}

