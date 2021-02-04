package Homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework8_1 {
    public static void main(String[] args) {
        List array = new ArrayList();
        array.add(1000);
        array.add(3.14);
        array.add(21L);
        array.add(new Short("100"));
        array.add(5.1);
        array.add("Kitty");
        array.add(100);
        array.add(1000);
        array.add(new Object());
        array.add("Snoopy");
        array.add(new BigInteger("1000"));
        //Iterator
        Iterator it = array.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        //for
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
        System.out.println();
        //foreach
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        //移除不是java.lang.Number相關的物件
        for (int i = 0; i < array.size(); i++) {
            if (!(array.get(i) instanceof Number)) {
                array.remove(array.get(i));
                i --;
            }
        }
        System.out.println();
        //再次印出
        for (Object obj : array) {
            System.out.print(obj + " ");
        }

    }
}
