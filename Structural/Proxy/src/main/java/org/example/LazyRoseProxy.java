package org.example;

public class LazyRoseProxy implements IRose {

    private PricklyRose rose;

    public LazyRoseProxy(PricklyRose rose) {
        this.rose = rose;
    }

    @Override
    public void sniff() {
        System.out.println("Próbuje powąchać kłującą róże");
        rose.sniff();
    }

    @Override
    public IRose take(int amount) {
        if(amount >5){
           return null;
        }
        return rose;

    }
}
