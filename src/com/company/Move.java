package com.company;


import com.company.modifiers.IModifier;

import java.util.ArrayList;

public class Move {
    private final int target;
    private final int movesLeft;
    private final int curValue;
    private final ArrayList<IModifier> availableMoves;

    public Move(int target, int movesLeft, int curValue, ArrayList<IModifier> availableMoves) {
        this.target = target;
        this.movesLeft = movesLeft;
        this.curValue = curValue;
        this.availableMoves = availableMoves;
    }

    /**
     * should probably check it a step sooner
     *
     * @return
     * @throws Exception
     */
    public ArrayList<IModifier> solve() throws Exception {
        for (IModifier modifier : availableMoves) {
            try {
                ArrayList<IModifier> afterMoves;

                int result = modifier.calculate(curValue);

                if (movesLeft == 1 && target != result) continue;

                    // Solution found
                else if (movesLeft == 1) afterMoves = new ArrayList<>();

                else afterMoves = new Move(target, movesLeft - 1, result, availableMoves).solve();

                afterMoves.add(modifier);

                return afterMoves;

            } catch (Exception ignored) {}
        }
        throw new Exception("No solution found");
    }
}
