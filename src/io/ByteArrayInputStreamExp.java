package io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExp {
    public static void main(String[] args) {
        byte[] array = {101,109,105,114};
        ByteArrayInputStream file = new ByteArrayInputStream(array);
        int i = file.read();
        while (i != -1){
            System.out.print((char) i);
            i = file.read();
        }
    }
}
