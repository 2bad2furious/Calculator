package com.company;


import com.company.modifiers.IButtonModifier;
import com.company.modifiers.AModifier;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CalculationResolver {


    public ArrayList<String> resolve(int target, int movesLeft, int curValue, ArrayList<AModifier> availableMoves, ArrayList<IButtonModifier> buttonMods) throws Exception {

        if (movesLeft < 1) throw new Exception("Number of moves left is too low");

        for (AModifier modifier : availableMoves) {
            try {
                ArrayList<String> afterMoves;

                int result = modifier.calculate(curValue);

                if (movesLeft == 1 && target != result) continue;

                    // Solution found
                else if (movesLeft == 1) afterMoves = new ArrayList<>();

                else afterMoves = resolve(target, movesLeft - 1, result, availableMoves, buttonMods);

                afterMoves.add(modifier.toString());

                return afterMoves;

            } catch (Exception ignored) {
            }
        }

        for (IButtonModifier modifier : buttonMods) {
            try {
                ArrayList<AModifier> newMods = modifier.modify(availableMoves);

                ArrayList<String> moves = resolve(target, movesLeft - 1, curValue, newMods, buttonMods);

                moves.add(modifier.toString());

                return moves;

            } catch (Exception ignored) {
            }
        }

        throw new Exception("No solution found");
    }
}
