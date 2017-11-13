package com.company;

import com.company.modifiers.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<IModifier> modifiers = new ArrayList<>();
        modifiers.add(new SubtractModifier(4));
        modifiers.add(new MultiplyModifier(-4));
        modifiers.add(new DivideModifier(3));
        modifiers.add(new DivideModifier(8));
        modifiers.add(new MultiplyModifier(-1));

        Move move = new Move(4, 5, 25, modifiers);
        System.out.println(25 + " " + move.findSolution().toString());
    }
}
