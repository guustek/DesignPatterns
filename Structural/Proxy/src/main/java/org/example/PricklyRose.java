package org.example;

public class PricklyRose implements IRose {

    private final IRose rose;

    public PricklyRose(IRose rose) {
        this.rose = rose;
    }

    @Override
    public void sniff() {
        System.out.println("Próbuje powąchać kłującą róże");
        rose.sniff();
    }

    @Override
    public IRose take(int amount) {
        return rose;
    }

}
