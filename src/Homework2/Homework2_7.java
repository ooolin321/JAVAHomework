package Homework2;

public class Homework2_7 {
    public static void main(String[] args){
        //for(int i = 0;i <= 6;i++)
        for(char i = 'A';i <= 'F';i++){
            for(int j = 6;j >= 6 - i + 'A';j--){
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
}
