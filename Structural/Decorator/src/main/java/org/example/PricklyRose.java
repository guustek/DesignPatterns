package org.example;

public class PricklyRose extends AbstractRoseDecorator {

    public PricklyRose(IRose rose) {
        super(rose);
    }

    @Override
    public void sniff() {
        System.out.println("AŁA");
        super.sniff();
    }
}
