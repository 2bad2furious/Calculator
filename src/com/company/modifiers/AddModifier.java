package com.company.modifiers;


public class AddModifier extends AModifier {


    public AddModifier(int modifier) {
        super(modifier);
    }

    @Override
    public int calculate(int currentValue) throws Exception {
        return currentValue + getModifier();
    }

    @Override
    public AModifier modify(AModifier modifier) {
        try {
            return new AddModifier(modifier.calculate(getModifier()));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "+ " + getModifier();
    }
}
