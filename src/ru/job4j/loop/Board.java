package ru.job4j.loop;

public class Board {
    public static void paint(int width, int hight) {
        for (int a = 0; a < hight; a++) {
            for (int b = 0; b < width; b++) {
                if ((a + b) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
            }

        }

        public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}





