package nested;

public class Out {
    public int a = 5;

    public class In {
        public int a = 10;

        public void run() {
            System.out.println("The 'run' method of the Inner class has been executed.");
            int a = 1;
            System.out.println(a);            // Prints local variable
            System.out.println(this.a);       // Prints inner class variable
            System.out.println(Out.this.a);   // Prints outer class variable
        }
    }

    public void run() {
        In in = new In();
        in.run();
    }
}