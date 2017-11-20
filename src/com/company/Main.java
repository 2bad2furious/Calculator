package com.company;

import com.company.modifiers.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<AModifier> modifiers = new ArrayList<>();
        modifiers.add(new AddModifier(8));
        modifiers.add(new MultiplyModifier(2));
        modifiers.add(new MultiplyModifier(5));

        ArrayList<IButtonModifier> buttonModifiers = new ArrayList<>();
        buttonModifiers.add(new ButtonAddModifier(new AddModifier(1)));

        // should probably name this something else xd
        CalculationResolver calculationResolver = new CalculationResolver();
        ArrayList<String> steps = calculationResolver.resolve(268, 5, 25, modifiers, buttonModifiers);
        Collections.reverse(steps);
        System.out.println(steps);
    }
}
