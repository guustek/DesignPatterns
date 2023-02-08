package org.example;

public class Factory1 extends DefaultCreator {

    @Override
    public Element buildElement() {
        return new Element1();
        }
        }
