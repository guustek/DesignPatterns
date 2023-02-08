package org.example;

public class Director {

    private HouseBuilder builder;

    public HouseBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public House make(String type){
        switch(type){
           case  "1":{
                builder.reset();
                builder.property1(1);
            }
            case "2":{
                builder.reset();
                builder.property4(3);
            }
        }
        return builder.build();
    }
}
