package com.company.modifiers;

public class SubtractModifier extends AModifier {

    public SubtractModifier(int modifier) {
        super(modifier);
    }

    @Override
    public int calculate(int currentValue) throws Exception {
        return currentValue - getModifier();
    }

    @Override
    public AModifier modify(AModifier modifier) {
        try {
            return new SubtractModifier(modifier.calculate(getModifier()));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return " - " + getModifier();
    }
}
