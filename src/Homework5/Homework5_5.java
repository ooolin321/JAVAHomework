package Homework5;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Homework5_5 {
    public static void genAuthCode(){
        char[] randArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','g','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0'};
        System.out.println("本次隨機產生驗證碼為:");
        for(int i = 1; i<=8;i++){
            System.out.print(randArray[(int)(Math.random()*62)]);
        }
    }


    public static void main(String[] args){
        genAuthCode();
    }
}
