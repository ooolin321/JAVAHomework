package Codecademy;

public class Euclidean {
    public static void main(String[] args){
        int a = 84;
        int b = 70;
        int side = a;
        while ((a%side!=0)||(b%side!=0)){
            side -=1;
        }
        System.out.println(side);
    }
}
