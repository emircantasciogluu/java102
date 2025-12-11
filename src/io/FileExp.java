package io;

import java.io.File;
import java.io.IOException;

public class FileExp {
    public static void main(String[] args) {
        File file1 = new File("src/example.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        try {
//            if (file.createNewFile()) {
//                System.out.println(file.getName() + " has been created!");
//            } else {
//                System.out.println(file.getName() + " already exists!");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred while creating the file.");
//            e.printStackTrace();
//        }
//
//        try {
//            if (file1.createNewFile()){
//                System.out.println(file1.getName() + " has been created!");
//            }else {
//                System.out.println(file1.getName() + " already exists!");
//            }
//        }catch (IOException e){
//            System.out.println("An error occurred while creating the file.");
//            e.printStackTrace();
//        }

//        file.delete();
//        file1.delete();
    }
}