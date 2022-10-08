package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(List<String> names) {
        for (String name : names) {
            this.cars.add(new Car(name));
        }
    }

    public String getNames() {
        StringCommaAppender appender = new StringCommaAppender("");
        for (Car car : this.cars) {
            appender.append(car.getName());
        }
        return appender.get();
    }

    public void move(List<MoveType> moveTypes) {
        for (int i=0, j=0;
             i < cars.size() && j < moveTypes.size();
             ++i, ++j) {
            Car car = cars.get(i);
            MoveType moveType = moveTypes.get(j);
            car.move(moveType);
        }
    }

    public List<Integer> getPositions() {
        List<Integer> positions = new ArrayList<>();
        for (Car car : this.cars) {
            positions.add(car.getPosition());
        }
        return positions;
    }
}
