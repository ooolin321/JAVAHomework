package Homework4;

import java.util.Arrays;

public class Try4_6 {
    public static void main(String[] args) {
        int[][] testScore = {{10, 35, 40, 100, 90, 85, 75, 70}, {37, 75, 77, 89, 64, 75, 70, 95}, {100, 70, 79, 90, 75, 70, 79, 90}, {77, 95, 70, 89, 60, 75, 85, 89}, {98, 70, 89, 90, 75, 90, 89, 90}, {90, 80, 100, 75, 50, 20, 99, 75}};
        int[] times = new int[testScore[0].length];
        for(int[] singleExam:testScore){
            int max = Arrays.stream(singleExam).max().getAsInt();
            for(int i =0 ;i<singleExam.length;i++){
                if(singleExam[i] == max){
                    times[i] ++;
                }
            }
        }
        for (int l = 0; l < times.length; l++) {
            System.out.println(l + 1 + "號同學考最高分次數:" + times[l]);
        }
    }
}
