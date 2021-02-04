package Homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public Calculator() {

    }

    public int powerXY(int x, int y) throws CalException {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("請輸入x的值");
            x = sc.nextInt();
            System.out.println("請輸入y的值");
            y = sc.nextInt();
        } catch (InputMismatchException ce) {
            throw new CalException("輸入格式不正確");
        }

        if (x > 0 && y > 0) {
            double result = Math.pow(x, y);
            System.out.print(x + "的" + y + "次方等於");
            return (int)result;
        } else if (x == 0 && y == 0) {
            throw new CalException("0的0次方沒有意義");
        } else if (y < 0) {
            throw new CalException("次方為負數，結果回傳不為整數!");
        } else {
            throw new CalException("輸入格式不正確");
        }
    }
}
