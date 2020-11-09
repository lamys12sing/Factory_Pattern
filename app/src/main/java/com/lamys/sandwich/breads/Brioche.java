package com.lamys.sandwich.breads;

public class Brioche implements Bread{
    @Override
    public String name() {
        return "Brioche";
    }

    @Override
    public int calories() {
        return 85;
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
