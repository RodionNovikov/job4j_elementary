package ru.job4j.calculator;

public class Fit {
    public static double manWeight (short height){
        double rsl = (height - 100) * 1.15;
        return rsl;
    }
    public static  double womanWeight (short height){
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
    public static void main (String[] args){
        short heightMan = 189;
        short heightWoman = 184;
                double man = Fit.manWeight(heightMan);
                double woman =Fit.womanWeight(heightWoman);
                System.out.println("man 189 is " +  man);
                System.out.println("woman 184 is " +  woman);

    }
}
