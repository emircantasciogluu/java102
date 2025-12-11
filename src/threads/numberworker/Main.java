package threads.numberworker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <= 10000; i++){
            numbers.add(i);
        }
        List<Integer> evenNumbers = Collections.synchronizedList(new ArrayList<>());
        List<Integer> oddNumbers = Collections.synchronizedList(new ArrayList<>());

        List<Integer> part1 = numbers.subList(0,2500);
        List<Integer> part2 = numbers.subList(2500,5000);
        List<Integer> part3 = numbers.subList(5000,7500);
        List<Integer> part4 = numbers.subList(7500,10000);

        Thread t1 = new Thread(new NumberWorker(part1, evenNumbers,oddNumbers));
        Thread t2 = new Thread(new NumberWorker(part2, evenNumbers,oddNumbers));
        Thread t3 = new Thread(new NumberWorker(part3, evenNumbers,oddNumbers));
        Thread t4 = new Thread(new NumberWorker(part4, evenNumbers,oddNumbers));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total even numbers  : " + evenNumbers.size());
        System.out.println("Total odd numbers   : " + oddNumbers.size());
        System.out.println("Total numbers (sum) : " + (evenNumbers.size() + oddNumbers.size()));

        System.out.println();
        System.out.println("First 10 even numbers: " + evenNumbers.subList(0, 10));
        System.out.println("First 10 odd numbers : " + oddNumbers.subList(0, 10));
    }
}
