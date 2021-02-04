package Homework10;

import java.util.ArrayList;

public class PrimeTest {
    public boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;
    }


    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int number : numbers) {
            if (isPrime(number)) {
                primes.add(number);
                System.out.println(number+"是質數");
            }else{
                System.out.println(number+"不是質數");
            }
        }

        return primes;
    }

    public static void main(String[] args) {

        PrimeTest pt = new PrimeTest();
        int[] numbers = new int[5];

        for (int i =0;i<numbers.length;i++) {
            numbers[i] = (int) (Math.random() * 100 + 1);
        }

        pt.onlyPrimes(numbers);
    }
}
