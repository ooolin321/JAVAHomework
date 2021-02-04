package Homework2;

public class Homework2_5 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i <= 49;i++){
            if(i/10 == 4 || i%10 == 4){
            }else{
                System.out.print(i + "\t");
                sum +=1;
            }
        }
        System.out.print("\n"+"總共有:"+sum+"個數字");
    }
}
