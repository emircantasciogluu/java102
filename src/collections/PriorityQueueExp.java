package collections;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExp {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        pQueue.add("Emir");
        pQueue.add("Can");

        for (String str: pQueue ){
            System.out.println(str);
        }
    }
}
