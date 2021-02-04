package Homework5;

public class MyRectangleMain {
    public static void main(String[] args) {
        MyRectangle area = new MyRectangle();
        area.setWidth(10);
        area.setDepth(20);
        area.getArea();
        MyRectangle area2 = new MyRectangle(10.0, 20.0);
        area2.getArea();
    }
}
