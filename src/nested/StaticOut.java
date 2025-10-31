package nested;

public class StaticOut {
    public int a = 5;
    public static int b = 20;

    public static class StaticIn {
        public static int a = 10;

        public static void run() {
            System.out.println("run() of StaticIn has been executed.");
            int a = 1;
            System.out.println(a);            // local 'a' -> 1
            System.out.println(StaticIn.a);   // static field of StaticIn -> 10
            // Note: cannot access 'StaticOut.a' here without an instance
            System.out.println(StaticOut.b);
        }
    }

    public void run() {
        // Calling the static nested class's static method
        StaticIn.run();
    }
}