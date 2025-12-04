package collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExp {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Ankara");
        vector.add("İstanbul");
        vector.add("Rize");
        vector.add("Antalya");
        vector.add("Ankara");

        vector.add(3, "Malatya");

        Iterator<String> itr = vector.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
