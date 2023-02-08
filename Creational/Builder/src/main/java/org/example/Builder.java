package org.example;

public class Builder {

    public static void main(String[] args) {
        House house = new HouseBuilderImpl()
                .property1(1)
                .property2(3)
                .build();

        new CityBuilder(new CustomHouseBuilder());
        System.out.println("Hello world!");

        Director director = new Director();
        director.setBuilder(new CustomHouseBuilder());

        House make = director.make("1");
    }
}