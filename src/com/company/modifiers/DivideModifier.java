package com.company.modifiers;

public class DivideModifier implements IModifier {

    private final int modifier;

    public DivideModifier(int modifier) {
        this.modifier = modifier;
    }

    @Override
    public int calculate(int currentValue) throws Exception {
        if (currentValue % modifier == 0) {
            return currentValue / modifier;
        }
        throw new Exception("Cannot divide");
    }

    @Override
    public String toString() {
        return " / " + modifier;
    }
}
