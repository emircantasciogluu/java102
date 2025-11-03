package generic;

public class Main {
    public static void main(String[] args) {
        String str = "abc";
        Nullable<String> n = new Nullable<>(str);
        n.run();

        Integer a = null;
        Nullable<Integer> n1 = new Nullable<>(a);
        n1.run();

        String s = "Hello World";
        Integer i = 12;
        Double d = 3.14;
        Test<String,Integer,Double> t = new Test<>(s,i,d);
        t.printInfo();
    }
}
