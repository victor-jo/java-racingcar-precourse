package racingcar.domain.car;

import racingcar.domain.move.Move;
import racingcar.util.StringCommaAppender;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Cars implements Iterable<Car> {

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

    public void move(Move move) {
        for (Car car : cars) {
            car.move(move.goOrStop());
        }
    }

    public List<Integer> getPositions() {
        List<Integer> positions = new ArrayList<>();
        for (Car car : this.cars) {
            positions.add(car.getPosition());
        }
        return positions;
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }

    @Override
    public void forEach(Consumer<? super Car> action) {
        cars.forEach(action);
    }

    @Override
    public Spliterator<Car> spliterator() {
        return cars.spliterator();
    }
}
