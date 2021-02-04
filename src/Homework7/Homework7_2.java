package Homework7;

import java.io.*;
import java.util.Arrays;

public class Homework7_2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("Data.txt", true);

            BufferedOutputStream bos = new BufferedOutputStream(fos);

            PrintStream ps = new PrintStream(bos);
            int[] num = new int[10];
            for (int i = 0; i < 10; i++) {
                num[i] = (int) (Math.random() * 1000) + 1;
            }

            ps.println(Arrays.toString(num));

            ps.close();
            bos.close();
            fos.close();
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
