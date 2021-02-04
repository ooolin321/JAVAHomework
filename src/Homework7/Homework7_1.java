package Homework7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework7_1 {
    public static void main(String[] args) throws IOException {
        String str;
        int charCount = 0;
        int count = 0;
        File file = new File("C:\\CEA103_Workspace\\JavaTest\\src\\Homework7\\Sample.txt");
        FileReader fr = new FileReader("C:\\CEA103_Workspace\\JavaTest\\src\\Homework7\\Sample.txt");
        BufferedReader br = new BufferedReader(fr);
        try {
            while ((str = br.readLine()) != null) {
                charCount += str.length();
                count++;
            }
        } catch (IOException e) {

        }
        long size = file.length();

        System.out.println("Sample.txt檔案共有" + size + "個位元組," + charCount + "個字元," + count + "列資料");
        br.close();
        fr.close();
    }
}
