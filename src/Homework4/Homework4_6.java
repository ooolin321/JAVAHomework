package Homework4;

import java.util.Arrays;

public class Homework4_6 {
    public static void main(String[] args){
        int[][] testScore = {{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}};
        int[] times = new int[8];//考最高分的次數
        for(int i = 0;i < testScore.length;i++) {
            int max = 0;
            for (int j = 0; j < testScore[i].length; j++) {
                if(j==testScore[i].length -1){//印出最大值
                    System.out.print(max+"\t");
                    for(int k =0; k < testScore[i].length;k++){//找出誰考最大值
                        if(testScore[i][k]==max) {
                            times[k] += 1;
                        }
                    }
                }
                if(testScore[i][j]>max){//找最大值
                    max = testScore[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(times));
        for(int l =0;l<times.length;l++) {
            System.out.println(l + 1 + "號同學考最高分次數:" + times[l]);
        }
    }
}
