package booksorter;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> books = new TreeSet<>();                // Comparable → sort by name
        Set<Book> books1 = new TreeSet<>(new OrderPageNumber()); // Comparator → sort by page count

        books.add(new Book("To Kill a Mockingbird", 336, "Harper Lee", 1960));
        books.add(new Book("Pride and Prejudice", 279, "Jane Austen", 1813));
        books.add(new Book("Brave New World", 311, "Aldous Huxley", 1932));
        books.add(new Book("Moby Dick", 635, "Herman Melville", 1851));
        books.add(new Book("The Hobbit", 310, "J.R.R Tolkien", 1937));

        books1.addAll(books);

        System.out.println("══════════════════════════════════════");
        System.out.println("        SORTED BY NAME (A → Z)");
        System.out.println("══════════════════════════════════════");
        for (Book b : books) {
            System.out.println(b.getName());
        }

        System.out.println("\n══════════════════════════════════════");
        System.out.println("      SORTED BY PAGE NUMBER (ASC)");
        System.out.println("══════════════════════════════════════");
        for (Book b1 : books1) {
            System.out.println(b1.getName());
        }
    }
}