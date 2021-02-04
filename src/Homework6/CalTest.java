package Homework6;

public class CalTest {
    public static void main(String[] args) throws CalException {
        while(true) {
            try {
                Calculator cal = new Calculator();
                System.out.print(cal.powerXY(1,1));
                break;
            } catch (CalException ce) {
                System.out.println(ce.getMessage());

            }
        }
    }
}
