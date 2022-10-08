package racingcar;

public class Car {

    private final CarName name;
    private int position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new CarName(name);
        this.position = position;
    }

    public String getName() {
        return this.name.get();
    }

    public void move(MoveType moveType) {
        if (moveType.isGo()) {
            this.position += 1;
        }
    }

    public int getPosition() {
        return this.position;
    }
}
