package com.company.modifiers;

public class MultiplyModifier extends AModifier {


    public MultiplyModifier(int modifier) {
        super(modifier);
    }

    @Override
    public int calculate(int currentValue) throws Exception {
        return currentValue * getModifier();
    }

    @Override
    public AModifier modify(AModifier modifier) {
        try {
            return new MultiplyModifier(modifier.calculate(getModifier()));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return " * " + getModifier();
    }
}
