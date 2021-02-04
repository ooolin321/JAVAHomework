package Homework7;

import java.io.*;

public class Homework7_5 implements Serializable {

    public static void main(String[] args) throws Exception {
        File file = new File("C:\\data\\Object.ser");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(file.getName());
        try {
            for(int i = 0;i<4;i++){
                ((Animal)ois.readObject()).speak();
            }

        } catch (EOFException e) {
            System.out.println("資料讀取完畢！");
        }
    }
}
