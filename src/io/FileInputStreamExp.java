package io;

import java.io.FileInputStream;

public class FileInputStreamExp {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("src/example.txt");
            int i = file.read();
            while(i != -1){
                System.out.print((char) i);
                i = file.read();
            }
            file.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
