package com.company;


import com.company.modifiers.IModifier;

import java.lang.reflect.Array;
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
    public ArrayList<IModifier> findSolution() throws Exception {
        for (IModifier modifier : availableMoves) {
            try {
                int result = modifier.calculate(curValue);
                ArrayList<IModifier> moves = new ArrayList<>();
                moves.add(modifier);
                if (movesLeft == 1 && target != result) continue;
                else if (movesLeft != 1)
                    moves.addAll(new Move(target, movesLeft - 1, result, availableMoves).findSolution());
                return moves;
            } catch (Exception ignored) {}
        }
        throw new Exception("No solution found");
    }
}
