package Homework9;

public class BigEater implements Runnable {
    int counter = 10;

    public BigEater() {
    } // 建構者函數


    public void run() { // 執行緒執行的地方
        String nameOfcurrentThread = Thread.currentThread().getName();
        while (counter > 0) {
            System.out.println(nameOfcurrentThread + "吃第" + (11 - counter) + "碗飯");
            counter--;
            if (counter == 0) {
                System.out.println(nameOfcurrentThread + "吃完了");
            }

            try {
                Thread.sleep((int) (Math.random() * 2500 + 500)); // 暫停一秒
            } catch (Exception e) {
            }
        }
    }

    public static void main(String arg[]) {
        BigEater b1 = new BigEater();// 產生Runnable物件
        BigEater b2 = new BigEater();
        Thread t1 = new Thread(b1,"饅頭人");
        Thread t2 = new Thread(b2,"詹姆士");

        System.out.println("-----大胃王快食比賽開始!-----");
        t1.start();
        t2.start();
        while(true){
            if(!t1.isAlive()&&!t2.isAlive()) {
                System.out.println("-----大胃王快食比賽結束!-----");
                break;
            }
        }
    }

}