package com.company.modifiers;


public class AddModifier implements IModifier {

    private final int modifier;

    public AddModifier(int modifier) {
        this.modifier = modifier;
    }

    @Override
    public int calculate(int currentValue) throws Exception {
        return currentValue + this.modifier;
    }

    @Override
    public String toString() {
        return "+ " + modifier;
    }
}
