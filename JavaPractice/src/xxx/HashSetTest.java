package xxx;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetTest {

    public static void main(String[] args) {
        Set set = new HashSet();

        while(set.size() < 6) {
            set.add((int) (Math.random() * 49 + 1));
        }

        Iterator objs = set.iterator();
        while (objs.hasNext()) {
            System.out.print(objs.next() + "\t");
        }

    }
}
