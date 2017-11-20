package com.company.modifiers;


public abstract class AModifier {

    private int modifier;

    public AModifier(int modifier) {
        this.modifier = modifier;
    }

    public int getModifier() {
        return modifier;
    }

    public abstract int calculate(int currentValue) throws Exception;

    public abstract AModifier modify(AModifier modifier);
}