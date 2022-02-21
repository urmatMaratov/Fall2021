package com.digital_nomads.javaFall2021.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) throws Exception {

//            FileWriter myWriter = new FileWriter("filename.txt");
//            myWriter.write("My file is created!");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file");

        int[] a = new int[4];
//        System.out.println(Demo1.test(a));

        throw new Exception("This is my Exception");
    }

    public static boolean test(int[] b) throws Exception{
        int [] a = new int[b.length];
        return false;
    }
}
