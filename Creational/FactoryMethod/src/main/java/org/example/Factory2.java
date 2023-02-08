package org.example;

public class Factory2 extends DefaultCreator {

    @Override
    public Element buildElement() {
        return new Element2();
    }
}
