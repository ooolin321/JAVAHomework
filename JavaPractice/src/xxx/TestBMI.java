package xxx;

public class TestBMI {
    public static void main(String[] args){
        double myWeight = 65;
        double myHeight = 1.78;
        double bmi = myWeight/Math.pow(myHeight,2);
        System.out.println("bmi: "+bmi);
        System.out.printf("bmi: %.2f%n",bmi);
        if (bmi <18.5){
            System.out.println("過瘦");
        }
        else if (bmi >= 18.5 && bmi < 24){
            System.out.println("正常");
        }
        else{
            System.out.println("過胖");
        }
    }
}
