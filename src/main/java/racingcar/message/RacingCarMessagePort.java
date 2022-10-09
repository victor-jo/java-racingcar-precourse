package racingcar.message;

import racingcar.context.Printer;
import racingcar.context.Scanner;
import racingcar.domain.car.Car;
import racingcar.domain.car.Cars;
import racingcar.domain.move.TryCount;
import racingcar.domain.winner.Winner;

public class RacingCarMessagePort implements RacingCarMessagePortAware, RacingCarMessageAware {

    private RacingCarMessage message = null;

    private final Printer printer;
    private final Scanner scanner;

    public RacingCarMessagePort(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public Cars getCars() {
        printer.println(getMessage().getNames());
        return new Cars(scanner.getNames());
    }

    @Override
    public TryCount getTry() {
        printer.println(getMessage().getTry());
        return new TryCount(scanner.getTry(printer));
    }

    @Override
    public void play(Cars cars) {
        for (Car car : cars) {
            printer.println(car.toString());
        }
        printer.println();
    }

    @Override
    public void finish(Winner winner) {
        printer.println(getMessage().getWinner() + winner.toString());
    }

    @Override
    public RacingCarMessage getMessage() {
        if (message == null) {
            message = new RacingCarMessage();
        }
        return message;
    }
}
