package org.example;

public class Proxy {

    public static void main(String[] args) {

        IRose rose = new Rose();
        rose.sniff();
        System.out.println(rose.take(1));

        rose = new PricklyRose(rose);
        rose.sniff();
        System.out.println(rose.take(2));

        rose = new LazyRoseProxy(new Rose());
        rose.sniff();
        System.out.println(rose.take(3));
    }
}