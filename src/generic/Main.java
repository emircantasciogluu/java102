package generic;

public class Main {
    public static void main(String[] args) {
//        String line = "-----------------------------";
//        System.out.println(line);
//        String str = "abc";
//        Nullable<String> n = new Nullable<>(str);
//        n.run();
//
//        Integer a = null;
//        Nullable<Integer> n1 = new Nullable<>(a);
//        n1.run();
//        System.out.println(line);
//
//        String s = "Hello World";
//        Integer i = 12;
//        Double d = 3.14;
//        Test<String,Integer,Double> t = new Test<>(s,i,d);
//        t.printInfo();
//        System.out.println(line);
//
//        String[] s1 = {"Hello", "World", "Java", "OOP"};
//        Integer[] i1 = {1,2,3,4};
//        Character[] c1 = {'J', 'A', 'V', 'A'};
//
//
//        Print.printArray(s1);
//        System.out.println(line);
//        Print.printArray(i1);
//        System.out.println(line);
//        Print.printArray(c1);
        Student<String> stu = new Student<>();
        stu.insert("ABC");

    }
}
