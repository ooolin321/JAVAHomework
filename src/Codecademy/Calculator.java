package Codecademy;

/*
This is an Abacus that is used to slide beads around and do math.
It was created by nisak in 2020/12/25.
*/
public class Calculator{
    public Calculator(){

    }
    public int add(int a,int b){
        return a+b;
    }
    public int substract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
    public int mudolo(int a,int b){
        return a%b;
    }
    public static void main(String[] args){
        Calculator myCalculator = new Calculator();
        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.substract(45,11));
    }
}
