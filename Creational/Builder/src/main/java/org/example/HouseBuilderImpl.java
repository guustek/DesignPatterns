package org.example;

public class HouseBuilderImpl implements HouseBuilder{

    private int property1;
    private int property2;
    private int property3;
    private int property4;
    private int property5;

    public HouseBuilder property1(int property) {
       property1 = property;
       return this;
    }

    public HouseBuilder property2(int property) {
        property2 = property;
        return this;
    }

    public HouseBuilder property3(int property) {
        property3 = property;
        return this;
    }

    public HouseBuilder property4(int property) {
        property4 = property;
        return this;
    }

    @Override
    public void reset() {
        property1 = 0;
    }

    public House build(){
        return new House(property1,property2,property3,property4,property5);
    }
}
