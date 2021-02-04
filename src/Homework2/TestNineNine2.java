package Homework2;

public class TestNineNine2 {
    public static void main(String[] args){
        for(int i = 1 ; i < 10 ; i++){
            int j = 1;
            do{
                System.out.print(i + "*" + j + "=" + i*j + "\t");
                j++;
            }while(j < 10);
            System.out.println();
        }
    }
}
