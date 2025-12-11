package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamExp {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "A3");


        try {
            FileOutputStream outputStream = new FileOutputStream("src/araba.txt");
            ObjectOutputStream output = new ObjectOutputStream(outputStream);
            output.writeObject(c1);
            output.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
