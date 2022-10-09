package racingcar.move;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MoveTypes implements Iterable<MoveType> {

    private final List<MoveType> moveTypes;

    public MoveTypes() {
        this.moveTypes = new ArrayList<>();
    }

    public void add(MoveType moveType) {
        this.moveTypes.add(moveType);
    }

    @Override
    public Iterator<MoveType> iterator() {
        return this.moveTypes.iterator();
    }

    @Override
    public void forEach(Consumer<? super MoveType> action) {
        this.moveTypes.forEach(action);
    }

    @Override
    public Spliterator<MoveType> spliterator() {
        return this.moveTypes.spliterator();
    }
}
