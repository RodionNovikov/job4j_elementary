package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int length = data.length - 1;
        for (int i = 0; i < length; i++) {
            int min = MinDiapason.findMin(data, i, length);
            int index = FindLoop.indexOf(data, min, i, length);
            int temp = data[i];
            //data[i] = data[index];
            data[i] = min;
            data[index] = temp;
        }
        return data;
    }
}
