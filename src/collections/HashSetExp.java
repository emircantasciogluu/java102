package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetExp {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(50);

        System.out.println(hSet.size());
        System.out.println();
//        for (Integer sayi: hSet){
//            System.out.println(sayi);
//        }

        Iterator<Integer> itr = hSet.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println();

        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        lSet.add("Sunday");
        lSet.add("Monday");
        lSet.add("Tuesday");
        lSet.add("Wednesday");
        lSet.add("Thursday");
        lSet.add("Friday");
        lSet.add("Saturday");

        Iterator<String> lItr = lSet.iterator();
        while (lItr.hasNext()){
            System.out.println(lItr.next());
        }
    }

}
