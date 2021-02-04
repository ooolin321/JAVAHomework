package Homework10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class AnyNumFormatter {

    public boolean isNum(String number) {
        try {
            Double.parseDouble(number);
            return true;
        } catch (NumberFormatException nfe) {
            nfe.getStackTrace();
            System.out.println("數字格式不正確，請再輸入一次!");
            return false;

        }
    }


    public void display() {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        while (true) {
            System.out.println("請輸入數字");
            String in = sc.next();
            if (isNum(in)) {
                System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");
                String in2 = sc.next();
                switch (in2) {
                    case ("1"):
                        Format f1 = new DecimalFormat("#,###.00");
                        System.out.println(f1.format(Double.parseDouble(in)));
                        break;
                    case ("2"):
                        Format f2 = new DecimalFormat("#.##%");
                        System.out.println(f2.format(Double.parseDouble(in)));
                        break;
                    case ("3"):
                        Format f3 = new DecimalFormat("#.#E00");
                        System.out.println(f3.format(Double.parseDouble(in)));
                        break;
                    default:
                        System.out.println("請輸入正確數字");
                }
                break;
            }
        }
    }


    public static void main(String[] args) {
        AnyNumFormatter anf = new AnyNumFormatter();
        anf.display();

    }
}


