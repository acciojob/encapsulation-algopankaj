package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj1=new RWOnly();

        obj1.setName("pankaj");

        String message=obj1.getName();
        System.out.println(message);
    }
}