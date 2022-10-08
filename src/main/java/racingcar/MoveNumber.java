package racingcar;

import static racingcar.MoveType.GO;
import static racingcar.MoveType.STOP;

public class MoveNumber {

    private static final int GO_LIMIT = 4;
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final String INVALID_MESSAGE = "숫자는 1에서 9까지만 입력 가능합니다.";

    private final int number;

    private MoveNumber(int number) {
        this.number = number;
    }

    public static MoveNumber valueOf(int number) {
        MoveNumber moveNumber = new MoveNumber(number);
        if (moveNumber.invalid()) {
            throw new IllegalArgumentException(INVALID_MESSAGE);
        }
        return moveNumber;
    }

    private boolean invalid() {
        return number < MIN || number > MAX;
    }

    public MoveType get() {
        return this.number >= GO_LIMIT ? GO : STOP;
    }
}
