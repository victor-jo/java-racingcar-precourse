package racingcar.domain.car;

import racingcar.context.ConsolePrinter;

public class CarName {

    public static final int MAX_LENGTH = 5;
    public static final String LENGTH_EXCEPTION_MESSAGE = "[ERROR] 자동차에 등록되는 이름은 5자 이하만 가능합니다.";
    private final String name;

    public CarName(String name) {
        this.name = name;
        if (this.invalidLength()) {
            ConsolePrinter errPrinter = new ConsolePrinter();
            errPrinter.println(LENGTH_EXCEPTION_MESSAGE);
            throw new IllegalArgumentException(LENGTH_EXCEPTION_MESSAGE);
        }
    }

    public String get() {
        return this.name;
    }

    private boolean invalidLength() {
        return this.name == null || name.length() > MAX_LENGTH;
    }
}
