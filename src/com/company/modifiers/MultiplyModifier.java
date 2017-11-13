package com.company.modifiers;

public class MultiplyModifier implements IModifier {

    private final int modifier;

    public MultiplyModifier(int modifier) {
        this.modifier = modifier;
    }

    @Override
    public int calculate(int currentValue) throws Exception {
        return currentValue * modifier;
    }

    @Override
    public String toString() {
        return " * " + modifier;
    }
}
