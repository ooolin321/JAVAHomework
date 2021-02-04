package Homework4;

import java.util.Scanner;

public class Homework4_5 {
    public static void main(String[] args){
        System.out.println("請輸入年月日三個整數");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        int days = 0;
        int[] usual   = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] unusual = {31,29,31,30,31,30,31,31,30,31,30,31};
        if(m>12||m<1){
            System.out.println("請輸入正常月份");
        }else if(d>31||d<1){
            System.out.println("請輸入正常日期");
        }else{
            if ((y%4==0&&y%100!=0)||y%400==0){//判斷閏年
                if((m==4||m==6||m==9||m==11)&&d>30){
                    System.out.println("超過該月份正常天數");
                }else if((m==2)&&d>29){
                    System.out.println("閏二月不可超過29天");
                }else{//計算天數
                    for(int i =0;i<m-1;i++){
                        days += unusual[i];
                    }
                    days += d;
                    System.out.println("輸入的日期為該年第"+days+"天");
                }
            }else{//判斷正常年
                if((m==4||m==6||m==9||m==11)&&d>30){
                    System.out.println("超過該月份正常天數");
                }else if((m==2)&&d>28){
                    System.out.println("二月不可超過28天");
                }else{
                    for(int i=0;i<m-1;i++){
                        days += usual[i];
                    }
                    days += d;
                    System.out.println("輸入的日期為該年第"+days+"天");
                }
            }
        }
    }
}
