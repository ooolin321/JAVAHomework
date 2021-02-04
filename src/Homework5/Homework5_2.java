package Homework5;

import java.util.Arrays;

public class Homework5_2 {
    public static void randAvg() {
        int[] array = new int[10];
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
            sum += array[i];
        }

        avg = sum / array.length;
        System.out.println("本次亂數結果:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        System.out.println("\n" + avg);

    }

    public static void main(String[] args) {
        randAvg();
    }
}
