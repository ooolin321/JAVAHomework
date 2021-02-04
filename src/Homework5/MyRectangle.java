package Homework5;

public class MyRectangle {
    double width = 0;
    double depth = 0;

    void setWidth(double width) {
        this.width = width;
    }

    void setDepth(double depth) {
        this.depth = depth;
    }

    double getArea() {
        System.out.println(width * depth);
        return width * depth;
    }

    public MyRectangle() {
        super();
    }

    public MyRectangle(double width, double depth) {
        super();
        this.width = width;
        this.depth = depth;
    }
}
