package com.company;

import com.company.modifiers.*;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<IModifier> modifiers = new ArrayList<>();
        modifiers.add(new SubtractModifier(4));
        modifiers.add(new MultiplyModifier(-4));
        modifiers.add(new DivideModifier(3));
        modifiers.add(new DivideModifier(8));
        modifiers.add(new MultiplyModifier(-1));

        // should probably name this something else xd
        CalculationResolver calculationResolver = new CalculationResolver(4, 5, 25, modifiers);
        ArrayList<IModifier> steps = calculationResolver.solve();
        Collections.reverse(steps);
        System.out.println(steps);
    }
}
