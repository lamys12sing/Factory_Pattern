package com.lamys.sandwich;

import com.lamys.sandwich.breads.Bread;
import com.lamys.sandwich.fillings.Cheese;
import com.lamys.sandwich.fillings.Filling;
import com.lamys.sandwich.fillings.Tomato;

public class FillingFactory extends AbstractFactory{
    @Override
    Bread getBread(String bread) {
        return null;
    }

    @Override
    Filling getFilling(String filling) {
        if (filling == null){
            return null;
        }

        if (filling == "CHE"){
            return new Cheese();
        }
        else if (filling == "TOM"){
            return new Tomato();
        }

        return null;
    }
}
