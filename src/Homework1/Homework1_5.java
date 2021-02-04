package Homework1;

public class Homework1_5 {
    public static void main(String[] args){
        int principal = 1500000;
        float interestRate = .02f;
        int period = 10;
        double compoundInterest = principal * Math.pow(1+interestRate,period);
        System.out.println(compoundInterest);
    }
}
