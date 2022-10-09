package racingcar.message;

import racingcar.domain.car.Cars;
import racingcar.domain.winner.Winner;

public interface RacingCarMessagePortAware {
    Cars getCars();
    int getTry();
    void play(Cars cars);
    void finish(Winner winner);
}
