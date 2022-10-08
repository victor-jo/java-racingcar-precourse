package racingcar.car;

import racingcar.move.MoveType;
import racingcar.move.Position;

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

    public void move(MoveType moveType) {
        if (moveType.isGo()) {
            this.position.go();
        }
    }

    public int getPosition() {
        return this.position.get();
    }
}
