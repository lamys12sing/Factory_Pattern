package com.lamys.sandwich.breads;

public class Baguette implements Bread {
    @Override
    public String name() {
        return "Baguette";
    }

    @Override
    public int calories() {
        return 150;
    }

    @Override
    public String image() {
        return "R.drawable.baguette";
    }

    @Override
    public String description() {
        return "Fresh and crunchy";
    }
}
