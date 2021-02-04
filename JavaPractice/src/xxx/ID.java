package xxx;

import java.util.Scanner;

public class ID {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("ID驗證");
            String id = sc.next();
            String regex = "^[A-z][12]\\d{8}$";
            if (id.matches(regex)) {
                System.out.println("OK");
                break;
            } else {
                System.out.println("fail");
            }
        }
    }

}
