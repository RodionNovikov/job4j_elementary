package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
       int result = first >= second ? first : second;
      return result;
    }

    public static void main(String[] args) {
     int result  = Max.max(15, 19);
     System.out.println(result);
    }

}
