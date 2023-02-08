package org.example;

public class House {

    private boolean isInCity;
    private int property1;
    private int property2;
    private int property3;
    private int property4;
    private int property5;

    public void setProperty1(int property1) {
        this.property1 = property1;
    }

    public void setProperty2(int property2) {
        this.property2 = property2;
    }

    public void setProperty3(int property3) {
        this.property3 = property3;
    }

    public void setProperty4(int property4) {
        this.property4 = property4;
    }

    public void setProperty5(int property5) {
        this.property5 = property5;
    }

    public House(int property1, int property2, int property3, int property4, int property5) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
        this.property4 = property4;
        this.property5 = property5;
    }
}
