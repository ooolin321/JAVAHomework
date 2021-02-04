package xxx;

import java.util.LinkedHashSet;

public class LinkedTest {

    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(55);
        set.add(515);
        set.add(525);
        set.add(553);
        set.add(55);


        for(Integer i1 : set){
            System.out.println(i1);
        }

    }
}
