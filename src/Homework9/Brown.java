package Homework9;

class Account {
    private int balance = 0; // 餘額

    synchronized public void deposit(int amount) {
        while (balance > 3000) {
            System.out.println("媽媽看到餘額超過3000,暫停匯款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance += amount;
        System.out.println("媽媽存了" + amount + "，帳戶共有：" + balance);

        notify();
    }

    synchronized public void withdraw(int amount) {
        while (balance < amount) {
            System.out.println("熊大看到帳戶沒錢，暫停提款\n媽媽被熊大要求匯款!");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println("熊大領了" + amount + "，帳戶共有：" + balance);
        if (balance < 2000) {
            System.out.println("熊大看到餘額在2000以下，要求匯款");
            notify();
        }
    }
}

class Deposit extends Thread {
    Account account;


    public Deposit(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 10; i++)
            account.deposit(3000); // 每次匯3000
    }
}

class Withdraw extends Thread {
    Account account;


    public Withdraw(Account account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            account.withdraw(2000); // 每次領2000
        }
    }
}


public class Brown {
    public static void main(String[] args) {
        Account account = new Account();
        Deposit mom = new Deposit(account);
        Withdraw brown = new Withdraw(account);

        mom.start();
        brown.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        mom.stop();
    }
}
