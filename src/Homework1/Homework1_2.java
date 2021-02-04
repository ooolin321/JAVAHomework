package Homework1;

public class Homework1_2 {
    public static void main(String[] args){
        int twoHundredEggs = 200;
        int aDozen = 12;
        int howManyDozens = twoHundredEggs/aDozen;
        int howManyEggs = twoHundredEggs%aDozen;
        System.out.println(howManyDozens +"打" + howManyEggs +"顆");
    }
}
