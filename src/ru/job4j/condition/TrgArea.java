package ru.job4j.condition;

public class TrgArea {
    public static double trgArea (double a, double b, double c){
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p*((p-a)*(p-b)*(p-c)));
        return s;

    }
    public static void  main (String[] args){
        double s = TrgArea.trgArea(8,6,6);
        System.out.println("Area (2,2,2)" + s);
    }
}
