package org.example;

public class AbstractRoseDecorator implements IRose {

    IRose rose;

    public AbstractRoseDecorator(IRose rose) {
        this.rose = rose;
    }

    @Override
    public void sniff() {
        rose.sniff();
    }

    @Override
    public IRose take() {
        return rose.take();
    }

    public IRose undecorate(){
        return this.rose;
    }
}
