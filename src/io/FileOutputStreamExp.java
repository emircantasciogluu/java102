package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamExp {
    public static void main(String[] args) {
        String write = "\nLearn OutputStream";
        try {
            FileOutputStream file = new FileOutputStream("src/example.txt", true);
            byte[] writeByte = write.getBytes();
            file.write(writeByte);
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
