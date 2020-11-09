package com.lamys.sandwich.breads;

public class Roll implements Bread {
    @Override
    public String name() {
        return "Roll";
    }

    @Override
    public int calories() {
        return 75;
    }

    @Override
    public String image() {
        return null;
    }

    @Override
    public String description() {
        return null;
    }
}
