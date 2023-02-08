package org.example;

public interface HouseBuilder {

    HouseBuilder property1(int property);

    HouseBuilder property2(int property);

    HouseBuilder property3(int property);

    HouseBuilder property4(int property);

    void reset();

    House build();

}
