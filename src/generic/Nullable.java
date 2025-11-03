package generic;

public class Nullable<T> {
    private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isNull() {
        return this.value == null;
    }

    public void run() {
        if (isNull()) {
            System.out.println("This variable has no assigned value. (null)");
        } else {
            System.out.println(this.getValue());
        }
    }
}