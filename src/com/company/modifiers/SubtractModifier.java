package com.company.modifiers;

public class SubtractModifier implements IModifier {
    private final int modifier;

    public SubtractModifier(int modifier) {
        this.modifier = modifier;
    }

    @Override
    public int calculate(int currentValue) throws Exception {
        return currentValue - modifier;
    }

    @Override
    public String toString() {
        return " - " + modifier;
    }
}
