package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int therd) {
        int result = first >= second ? first : second;
        return result >= therd ? result : therd;
    }

    public static void main(String[] args) {
      int result = MultiMax.max(8, 4, 35);
      System.out.println(result);
    }
}
