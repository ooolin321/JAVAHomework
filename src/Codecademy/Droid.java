package Codecademy;

public class Droid{
    int batteryLevel;
    String name;
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }
    public String toString(){
        return "Hello,I'm the droid: "+ name;
    }
    public void performTask(String task){
        batteryLevel = batteryLevel -10;
        System.out.println(name+" is performing task: "+task);
    }
    public void energyReport(){
        System.out.println(name +"'s battery level is "+batteryLevel +"%");
    }
    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        Droid nisak = new Droid("Nisak");
        System.out.println(codey);
        System.out.println(nisak);
        codey.performTask("dancing");
        nisak.performTask("Shaking");
        nisak.performTask("Hiking");
        codey.energyReport();
        nisak.energyReport();
    }
}