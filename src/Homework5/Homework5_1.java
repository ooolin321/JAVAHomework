package Homework5;

import java.util.Scanner;

public class Homework5_1 {
    public static void starSquare(int width, int height) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入寬與高兩個整數");
        width = sc.nextInt();
        height = sc.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        starSquare(1, 1);
    }
}
