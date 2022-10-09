package racingcar.domain.car;

import racingcar.domain.move.Move;
import racingcar.domain.move.MoveType;
import racingcar.domain.move.Position;

public class Car {

    private final CarName name;
    private final Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = new Position(position);
    }

    public String getName() {
        return this.name.get();
    }

    public void move(Move move) {
        MoveType moveType = move.goOrStop();
        if (moveType.isGo()) {
            this.position.go();
        }
    }

    public int getPosition() {
        return this.position.get();
    }

    @Override
    public String toString() {
        return name.get() + " : " + position.toString();
    }
}
