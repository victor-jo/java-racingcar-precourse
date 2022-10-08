package racingcar;

public class Move {

    public static MoveType goOrStop(int number) {
        MoveNumber moveNumber = MoveNumber.valueOf(number);
        return moveNumber.get();
    }
}
