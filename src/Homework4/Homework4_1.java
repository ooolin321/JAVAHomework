package Homework4;

public class Homework4_1 {
    public static void main(String[] args){
        int[] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0;
        for(int i = 0;i < array.length;i++){
            sum +=array[i];
        }
        int avg = sum / array.length;
        System.out.println("所有元素的平均為:\n"+avg);
        System.out.print("大於平均的元素為:"+"\n");
        for(int j = 0;j < array.length;j++){
            if(array[j]>avg){
                System.out.print(array[j]+"\t");
            }
        }


    }
}
