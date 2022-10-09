package racingcar.message;

import racingcar.domain.car.Cars;
import racingcar.domain.move.TryCount;
import racingcar.domain.winner.Winner;

public interface RacingCarMessagePortAware {
    Cars getCars();
    TryCount getTry();
    void play(Cars cars);
    void finish(Winner winner);
    void error(String message);
}
