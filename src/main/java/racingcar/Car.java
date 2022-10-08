package racingcar;

public class Car {

    private final String name;
    private int position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        if (name == null || name.length() > 5) {
            throw new IllegalArgumentException("자동차에 등록되는 이름은 5자 이하만 가능합니다.");
        }
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return this.name;
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
