package threads;

public class RunnableExp {
    public static void main(String[] args) {
        RunnableCounter c1 = new RunnableCounter("c1");
        RunnableCounter c2 = new RunnableCounter("c2");
        RunnableCounter c3 = new RunnableCounter("c3");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
    }
}
