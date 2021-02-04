package Homework3;

import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入三個整數:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b+c || b>a+c || c>a+b || a == 0 || b== 0 || c== 0){
            System.out.println("不是三角形");
        }else if(a == b && b == c){
            System.out.println("正三角形");
        }else if(a== b || a == c || b == c){
            System.out.println("等腰三角形");
        }else if(a*a == b*b+c*c || b*b == a*a+c*c || c*c == a*a+b*b){
            System.out.println("直角三角形");
        }else{
            System.out.println("一般三角形");
        }
        }
    }
