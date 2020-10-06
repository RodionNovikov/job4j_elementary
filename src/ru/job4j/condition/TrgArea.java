package ru.job4j.condition;

public class TrgArea {
    public static double trgArea (double a, double b, double c){
        double p = (a + b + c) / 2;
        double S = Math.sqrt(p);
        return S;

    }
    public static void  main (String[] args){
        double S = TrgArea.trgArea(2,2,2);
        System.out.println("Area (2,2,2)" + S);
    }
}
