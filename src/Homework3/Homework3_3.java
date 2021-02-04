package Homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("阿文...請輸入你討厭哪個數字:");
        int number = sc.nextInt();
        int sum = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 1; i <= 49; i++) {
            if(i / 10 == number || i % 10 == number){
            } else {
                System.out.print(i + "\t");
                sum += 1;
                array.add(i);
            }
        }
        Collections.shuffle(array);
        System.out.println("\n" + "總共有:" + sum + "個數字");
        System.out.println(array.subList(0,6));
    }
}
