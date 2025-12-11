package threads;

public class RunnableCounter implements Runnable{
    private String name;

    public RunnableCounter(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 20; i++){
            System.out.println(this.getName() + " : " + i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
