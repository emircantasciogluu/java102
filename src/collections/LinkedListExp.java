package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExp {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Emir");
        list.add("Can");
        list.add("Taşcıoğlu");
        list.add("İrem");
        list.add("Ortakuyu");

        Iterator<String> itr = list.iterator();

        System.out.println("------ While ------");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println();

        System.out.println("------ ForEach ------");
        for (String str : list){
            System.out.println(str);
        }
    }
}
