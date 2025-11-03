package generic;

public class Student<T> implements IDatabase<T> {

    @Override
    public boolean insert(T data) {
        System.out.println("Data has been inserted.");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println("Data has been deleted.");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println("Data has been updated.");
        return true;
    }

    @Override
    public T select() {
        System.out.println("Data has been retrieved.");
        return null;
    }
}