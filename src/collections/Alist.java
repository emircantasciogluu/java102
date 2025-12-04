package collections;

import java.util.*;

public class Alist {
    public static void main(String[] args) {

        // Initialize an ArrayList that stores elements of type String
        List<String> nameList = new ArrayList<>();

        // Elements are added sequentially, starting from index 0
        nameList.add("Gamze");
        nameList.add("Elif");
        nameList.add("Mustafa");
        nameList.add("Umut");
        nameList.add("Umut");

        // ArrayList can store null values
        nameList.add(null);

        // Print the entire list
        System.out.println(nameList);

        // size() method comes from the Collection interface
        System.out.println("Size of list: " + nameList.size());

        // Read elements using get(). It does NOT remove them from the list.
        System.out.println("Element at index 1: " + nameList.get(1));
        System.out.println("Element at index 2: " + nameList.get(2));

        // Finds the index of the first occurrence of "Umut"
        System.out.println("Index of 'Umut': " + nameList.indexOf("Umut"));

        // Finds the index of the last occurrence of "Umut"
        System.out.println("Last index of 'Umut': " + nameList.lastIndexOf("Umut"));

        // add(index, element) adds an element at the specified index
        // Existing elements from that index onward are shifted to the right
        nameList.add(3, "Zeynep");

        // set(index, element) replaces the element at the specified index
        // The index must be within the list boundaries
        nameList.set(1, "Naz");

        // contains() checks if the specified element exists in the list
        System.out.println(nameList.contains("Elif"));
        System.out.println(nameList.contains("Mustafa"));

        // remove(index) deletes the element at the given index
        // and returns the removed element
        String firstElement = nameList.remove(0);
        System.out.println(firstElement + " is removed from the list!");

        // Creating a new list to merge with the original one
        List<String> newNameList = new ArrayList<>();
        newNameList.add("Batuhan");
        newNameList.add("Kemal");

        // addAll() adds all elements of another list
        nameList.addAll(newNameList);

        // subList(from, to) creates a new list from a specific range
        // 'from' index is inclusive, 'to' index is exclusive
        List<String> subList = nameList.subList(4, 6);

        System.out.println("Sublist from name list:");
        System.out.println(subList);

        // toArray() with no parameters returns an Object[] array
        Object[] objectArray = nameList.toArray();

        // toArray(T[] array) returns an array of the specified type
        String[] stringArray = nameList.toArray(new String[0]);

        // clear() removes all elements from the list
        nameList.clear();
    }
}