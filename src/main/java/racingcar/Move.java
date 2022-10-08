package racingcar;

import static racingcar.MoveType.GO;
import static racingcar.MoveType.STOP;

public class Move {

    public static final int GO_LIMIT = 4;

    public static MoveType goOrStop(int number) {
        if (number < 1 || number > 9) {
            throw new IllegalArgumentException("숫자는 1에서 9까지만 입력 가능합니다.");
        }
        if (number >= GO_LIMIT) {
            return GO;
        }
        return STOP;
    }
}
