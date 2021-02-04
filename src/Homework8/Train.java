package Homework8;

import java.util.*;

public class Train implements Comparable<Train> {
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    public Train() {

    }

    public void setter(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public String getStart() {
        return start;
    }

    public String getDest() {
        return dest;
    }

    public double getPrice() {
        return price;
    }

    public void getter() {
        System.out.println(number + " \t" + type + " \t" + start + "\t" + dest + "\t" + price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number && Double.compare(train.price, price) == 0 && Objects.equals(type, train.type) && Objects.equals(start, train.start) && Objects.equals(dest, train.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }


    public int compareTo(Train aTrain) {
        if (this.number > aTrain.number) {
            return -1;
        } else if (this.number == aTrain.number) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Train train1 = new Train();
        Train train2 = new Train();
        Train train3 = new Train();
        Train train4 = new Train();
        Train train5 = new Train();
        Train train6 = new Train();
        Train train7 = new Train();

        train1.setter(202, "普悠瑪", "樹林", "花蓮", 400);
        train2.setter(1254, "區間", "屏東", "基隆", 700);
        train3.setter(118, "自強", "高雄", "台北", 500);
        train4.setter(1288, "區間", "新竹", "基隆", 400);
        train5.setter(122, "自強", "台中", "花蓮", 600);
        train6.setter(1222, "區間", "樹林", "七堵", 300);
        train7.setter(1254, "區間", "屏東", "基隆", 700);
        //HashSet
        Set<Train> trainArray = new HashSet<Train>();
        trainArray.add(train1);
        trainArray.add(train2);
        trainArray.add(train3);
        trainArray.add(train4);
        trainArray.add(train5);
        trainArray.add(train6);
        trainArray.add(train7);
        System.out.println("請寫一隻程式，能印出不重複的Train物件");
        Iterator it = trainArray.iterator();
        while (it.hasNext()) {
            ((Train) it.next()).getter();
        }

        System.out.println();
        //ArrayList
        List<Train> trainArray2 = new ArrayList<Train>();
        trainArray2.add(train1);
        trainArray2.add(train2);
        trainArray2.add(train3);
        trainArray2.add(train4);
        trainArray2.add(train5);
        trainArray2.add(train6);
        trainArray2.add(train7);
        Collections.sort(trainArray2);
        System.out.println("請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出");
        for (int i = 0; i < trainArray2.size(); i++) {
            ((Train) trainArray2.get(i)).getter();
        }
        System.out.println();
        //TreeSet
        Set<Train> set = new TreeSet<Train>();
        set.add(train1);
        set.add(train2);
        set.add(train3);
        set.add(train4);
        set.add(train5);
        set.add(train6);
        set.add(train7);
        System.out.println("承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件");
        for (Object obj : set) {
            ((Train) obj).getter();

        }


    }
}
