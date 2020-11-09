package com.lamys.sandwich;

import com.lamys.sandwich.breads.Baguette;
import com.lamys.sandwich.breads.Bread;
import com.lamys.sandwich.breads.Brioche;
import com.lamys.sandwich.breads.Roll;
import com.lamys.sandwich.fillings.Filling;

public class BreadFactory extends AbstractFactory{
    @Override
    Bread getBread(String bread) {
        if (bread == null){
            return null;
        }

        if (bread == "BAG"){
            return new Baguette();
        }
        else if (bread == "BRI"){
            return new Brioche();
        }
        else if (bread == "ROL"){
            return new Roll();
        }

        return null;
    }

    @Override
    Filling getFilling(String filling) {
        return null;
    }
}
