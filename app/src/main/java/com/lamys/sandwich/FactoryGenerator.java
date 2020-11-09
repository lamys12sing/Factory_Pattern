package com.lamys.sandwich;

public class FactoryGenerator {
    public static AbstractFactory getFactory(String factory){
        if (factory == null){
            return null;
        }

        if (factory == "BRE"){
            return new BreadFactory();
        }
        else if (factory == "FIL"){
            return new FillingFactory();
        }

        return null;
    }
}
