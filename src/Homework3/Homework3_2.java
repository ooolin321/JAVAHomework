package Homework3;

import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("開始猜數字吧!");
        int numberToGuess = (int) (Math.random() * 101);
        while(true){
            int guess = sc.nextInt();
            if(guess == numberToGuess){
                System.out.println("猜對囉");
                break;
            }else if(guess > numberToGuess){
                System.out.println("猜錯囉，數字小一點");
            }else {
                System.out.println("猜錯囉，數字大一點");
            }
        }
    }
}
