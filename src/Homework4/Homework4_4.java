package Homework4;

import java.util.Scanner;

public class Homework4_4 {
    public static void main(String[] args){
        System.out.println("請輸入欲借的金額:");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int count = 0;
        int[][] array = {{25,2500},{32,800},{8,500},{19,1000},{27,1200}};
        System.out.println("有錢可借的員工編號:");
        for(int i = 0;i < array.length;i++){
            if(amount <= array[i][1]){
                System.out.print(array[i][0]+"\t");
                count +=1;
            }
        }
        System.out.println("共 "+count+" 人!");
    }
}
