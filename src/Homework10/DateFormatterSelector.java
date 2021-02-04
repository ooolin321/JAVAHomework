package Homework10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateFormatterSelector {
    public boolean isDate(String date) {
        String regex = "^\\d{4}(0?[1-9]|1[012])(0?[1-9]|[12][0-9]|3[01])$";
        return date.matches(regex);
    }

    public void display() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("請輸入日期(年月日，例如:20110131)");
            String in = sc.next();
            if (isDate(in)) {
                System.out.println("欲格式化成(1)年/月/日(2)月/日/年(3)日/月/年:");
                String in2 = sc.next();
                SimpleDateFormat f1 = new SimpleDateFormat("yyyyMMdd");
                try {
                    Date date = f1.parse(in);
                    switch (in2) {
                        case "1": {
                            System.out.printf("%tY/%<tm/%<td", date);
                            break;
                        }
                        case "2": {
                            System.out.printf("%tm/%<td/%<tY", date);
                            break;
                        }
                        case "3": {
                            System.out.printf("%td/%<tm/%<tY", date);
                            break;
                        }
                        default:
                            System.out.println("請輸入正確數字");
                    }
                    break;
                } catch (ParseException pe) {
                    pe.getStackTrace();
                }
            } else {
                System.out.println("請輸入正確格式");
            }
        }
    }


    public static void main(String[] args) {
        DateFormatterSelector df = new DateFormatterSelector();
        df.display();
    }
}
