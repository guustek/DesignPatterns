package org.example;

public class Decorator {

    public static void main(String[] args) {

        IRose rose = new Rose();
        rose.sniff();

        System.out.println();

        rose = new PricklyRose(rose);
        rose = new PricklyRose(rose);
        rose.sniff();

        rose = rose.undecorate();

        System.out.println(rose.getClass());
    }
}