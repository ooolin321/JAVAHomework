package Homework7;

import java.io.*;

public class Homework7_3 {
    public static void copyFile(File inputFile, File outputFile) throws IOException {

        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);
        int c;

//         使用FileInputStream,FileOutputStream 時, 解決中文碼印出問題
        int i = 0;
        byte ch[] = new byte[(int) inputFile.length()];
        while ((c = in.read()) != -1) {
            out.write(c);
            ch[i++] = (byte) c;
        }

        System.out.flush();
        in.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        File f1 = new File("C:\\CEA103_Workspace\\JavaTest\\Data.txt");
        File f2 = new File("C:\\CEA103_Workspace\\JavaTest\\Data2.txt");
        try {
            copyFile(f1, f2);
        } catch (IOException e) {
        }
    }
}
