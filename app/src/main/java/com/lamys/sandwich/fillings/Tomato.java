package com.lamys.sandwich.fillings;

public class Tomato implements Filling {
    @Override
    public String name() {
        return "Tomato";
    }

    @Override
    public String calories() {
        return "50 kcal";
    }
}
