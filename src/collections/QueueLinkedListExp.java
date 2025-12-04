package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListExp {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Emir");
        queue.add("Can");
        queue.add("Taşcıoğlu");

        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
