package racingcar.domain.winner;

import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;

import java.util.ArrayList;
import java.util.List;

public class Winner {

    private final List<String> winnerNames = new ArrayList<>();
    private Cars winner;

    public Winner(Cars candidates) {
        candidates.sort();
        judge(candidates);
    }

    private void judge(Cars candidates) {
        int position = -1;
        for (Car candidate : candidates) {
            appendWinner(candidate, position);
            position = Math.max(position, candidate.getPosition());
        }
        this.winner = new Cars(winnerNames);
    }

    private void appendWinner(Car candidate, int position) {
        if (candidate.isWin(position)) {
            this.winnerNames.add(candidate.getName());
        }
    }

    @Override
    public String toString() {
        return winner.getNames();
    }
}
