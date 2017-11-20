package com.company;


import com.company.modifiers.IModifier;

import java.util.ArrayList;

public class CalculationResolver {


    public ArrayList<IModifier> solve(int target, int movesLeft, int curValue, ArrayList<IModifier> availableMoves) throws Exception {
        for (IModifier modifier : availableMoves) {
            try {
                ArrayList<IModifier> afterMoves;

                int result = modifier.calculate(curValue);

                if (movesLeft == 1 && target != result) continue;

                    // Solution found
                else if (movesLeft == 1) afterMoves = new ArrayList<>();

                else afterMoves = solve(target, movesLeft - 1, result, availableMoves);

                afterMoves.add(modifier);

                return afterMoves;

            } catch (Exception ignored) {
            }
        }
        throw new Exception("No solution found");
    }
}
