package com.digital_nomads.javaFall2021.exceptions;

public class Exceptions {

    public static void main(String[] args) {

       try {
           int[] a = new int[3];
           System.out.println(a[4]);
           System.out.println("Hello World");
       }catch (Exception e){
           System.err.println("something went wrong");
       }
        System.out.println("Hello world");
    }
}
