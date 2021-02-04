package Homework7;

import java.io.*;

public class Homework7_4 implements Serializable {

    private static final long serialVersionUID = 9L;

    public static void main(String[] args) throws Exception {

        File dir = new File("c:\\data");
        File file = new File("c:\\data\\Object.ser");
        if (!dir.exists()) {
            dir.mkdir();
        }
        Object[] animals = new Object[4];
        animals[0] = new Dog("doggy");
        animals[1] = new Dog("doggy2");
        animals[2] = new Cat("kitty");
        animals[3] = new Cat("kitty2");
        //輸出
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (int i = 0; i < animals.length; i++) {
            oos.writeObject(animals[i]);
        }
        oos.close();
        fos.close();
    }
}
