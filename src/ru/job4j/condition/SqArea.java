package ru.job4j.condition;

public class SqArea {
    public static double sqArea(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double s = l * h;
        return s;
    }

      public static void main (String[] args){
        double result = SqArea.sqArea(6,2);
        System.out.println("если p = 6, а k = 2, real = " + result);
    }
}
