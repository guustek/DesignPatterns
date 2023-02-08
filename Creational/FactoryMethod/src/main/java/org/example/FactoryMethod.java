package org.example;

public class FactoryMethod {

    public static void main(String[] args) {
        int x = 0;
        DefaultCreator factory = new DefaultCreator();
        if (x == 7) {
            factory = new Factory2();
        }
        Element element = factory.buildElement();
        System.out.println("Hello world!");
    }
}