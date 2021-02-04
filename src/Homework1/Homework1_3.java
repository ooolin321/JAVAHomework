package Homework1;

public class Homework1_3 {
    public static void main(String[] args){
        int totalSeconds =256559;
        int howManyDays = totalSeconds/86400;
        int howManyHours = (totalSeconds%86400)/3600;
        int howManyMinutes = (totalSeconds%3600)/60;
        int howMnaySeconds = totalSeconds%60;
        System.out.println(howManyDays+"天"+howManyHours+"小時"+howManyMinutes+"分"+howMnaySeconds+"秒");
    }
}
