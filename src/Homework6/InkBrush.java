package Homework6;

public class InkBrush extends Pen {
    public InkBrush() {
        super();
    }

    public InkBrush(String name, int price) {
        super(name, price);
    }


    @Override
    public void write() {
        System.out.println("沾墨水再寫");
    }

    @Override
    public int getPrice() {
        return (int) (super.getPrice() * 0.9);
    }
}
