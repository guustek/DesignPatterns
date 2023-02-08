package org.example;

public class ToxicRose extends AbstractRoseDecorator {

    public ToxicRose(IRose rose) {
        super(rose);
    }

    @Override
    public void sniff() {
        rose.sniff();
        System.out.println("Zostałeś zatruty");
    }
}
