package com.lamys.sandwich.fillings;

public class Cheese implements Filling {
    @Override
    public String name() {
        return "Cheese";
    }

    @Override
    public String calories() {
        return "155 kcal";
    }
}
