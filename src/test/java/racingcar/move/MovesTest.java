package racingcar.move;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovesTest {

    @Test
    void 하나의_숫자생성기로_여러개의_전진과_멈춤을_생성한다() {
        Moves moves = new Moves(() -> 4);
        MoveTypes moveTypes = moves.get(3);

        for (MoveType moveType : moveTypes) {
            assertTrue(moveType.isGo());
        }
    }
}
