package com.company.modifiers;

public class DivideModifier extends AModifier {

    public DivideModifier(int modifier) {
        super(modifier);
    }

    @Override
    public int calculate(int currentValue) throws Exception {
        if (currentValue % getModifier() == 0) {
            return currentValue / getModifier();
        }
        throw new Exception("Cannot divide");
    }

    @Override
    public AModifier modify(AModifier modifier) {
        try {
            return new DivideModifier(modifier.calculate(getModifier()));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return " / " + getModifier();
    }
}
