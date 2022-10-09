package racingcar.move;

import java.util.function.Supplier;

public class Moves {

    private final Move move;

    public Moves(Supplier<Integer> generator) {
        this.move = new Move(generator);
    }

    public MoveTypes get(int count) {
        MoveTypes moveTypes = new MoveTypes();
        for (int i = 0; i < count; i++) {
            moveTypes.add(move.goOrStop());
        }
        return moveTypes;
    }
}
