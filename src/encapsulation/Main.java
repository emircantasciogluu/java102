package encapsulation;

public class Main {
    public static void main(String[] args) {
        Book lotr = new Book("Lord of The Ring", -1000);
        lotr.setPageNumber(-1200);
        System.out.println(lotr.getPageNumber());
        lotr.setPageNumber(1000);
        System.out.println(lotr.getPageNumber());
    }
}
