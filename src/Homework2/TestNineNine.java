package Homework2;

public class TestNineNine {
    public static void main(String[] args){
        for(int i = 1 ; i < 10 ; i++){
            int j =1;
            while(j < 10){
                System.out.print(i + "*" + j + "=" + i*j +"\t");
                j++;
            }
            System.out.println();
        }

    }
}
