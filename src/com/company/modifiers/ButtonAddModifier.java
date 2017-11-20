package com.company.modifiers;

import java.util.ArrayList;

public class ButtonAddModifier implements IButtonModifier {

    public ButtonAddModifier(AModifier modifier) {
        this.modifier = modifier;
    }

    /**
     * TODO fix dem names
     */
    private AModifier modifier;


    @Override
    public ArrayList<AModifier> modify(ArrayList<AModifier> buttons) {
        ArrayList<AModifier> newMods = new ArrayList<>();
        for (AModifier iModifier : buttons) {
            AModifier newMod = iModifier.modify(modifier);
            if (newMod == null) throw new NullPointerException("This should not happen");

            newMods.add(newMod);
        }
        return newMods;
    }

    @Override
    public String toString() {
        return "[" + modifier.toString() + "]";
    }
}
