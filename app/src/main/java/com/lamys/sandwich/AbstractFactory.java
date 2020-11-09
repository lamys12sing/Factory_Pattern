package com.lamys.sandwich;

import com.lamys.sandwich.breads.Bread;
import com.lamys.sandwich.fillings.Filling;

public abstract class AbstractFactory {
    abstract Bread getBread(String bread);
    abstract Filling getFilling(String filling);
}
