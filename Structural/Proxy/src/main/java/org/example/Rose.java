package org.example;

public class Rose implements IRose {

    public void sniff(){
        System.out.println("Powąchana");
    }

    public IRose take(){
        System.out.println("Zerwano");
        return this;
    }

}
