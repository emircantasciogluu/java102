package genericlist;

public class Main {
    public static void main(String[] args) {
        // === Part 1: Capacity growth & size ===
        MyList<Integer> list = new MyList<>();
        System.out.println("Capacity : " + list.getCapacity()); // 10
        System.out.println("Size     : " + list.size());        // 0

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Size     : " + list.size());        // 4
        System.out.println("Capacity : " + list.getCapacity());  // 10

        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);

        System.out.println("Size     : " + list.size());        // 11
        System.out.println("Capacity : " + list.getCapacity());  // 20
        System.out.println("List     : " + list);

        // === Part 2: get / remove / set ===
        System.out.println("Value at index 2 : " + list.get(2)); // 30
        System.out.println("Removed at index 2 : " + list.remove(2)); // remove 30
        list.add(40);
        System.out.println("After add(40)     : " + list);
        System.out.println("Set index 0 -> 100 (prev: " + list.set(0, 100) + ")");
        System.out.println("Value at index 2  : " + list.get(2)); // 40
        System.out.println("List              : " + list);

        // === Part 3: indexOf / lastIndexOf ===
        System.out.println("indexOf(20)       : " + list.indexOf(20));
        System.out.println("indexOf(1000)     : " + list.indexOf(1000)); // -1
        System.out.println("lastIndexOf(20)   : " + list.lastIndexOf(20));

        // === Part 4: toArray / subList / contains ===
        Object[] arr = list.toArray();
        System.out.println("First element of toArray() : " + arr[0]);

        MyList<Integer> sub = list.subList(0, Math.min(3, list.size() - 1));
        System.out.println("Sublist(0..3) : " + sub);

        System.out.println("Contains 20    : " + list.contains(20));
        System.out.println("Contains 120   : " + list.contains(120));

        // === Part 5: clear ===
        list.clear();
        System.out.println("After clear()   : " + list + " | size=" + list.size() + " | capacity=" + list.getCapacity());
    }
}