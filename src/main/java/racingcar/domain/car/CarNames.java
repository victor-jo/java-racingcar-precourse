package racingcar.domain.car;

import java.util.Arrays;
import java.util.List;

public class CarNames {

    private static final String ERROR_TYPE = "[ERROR] 자동차 이름은 한글이나 영어만 가능합니다.";
    private static final String ERROR_LENGTH = "[ERROR] 자동차 이름은 공백일 수 없습니다.";
    private final List<String> names;

    public CarNames(String str) {
        this.names = Arrays.asList(str.split(","));
        this.invalid();
    }

    private void invalid() {
        for (String name : names) {
            invalidName(name);
        }
    }

    private void invalidName(String name) {
        if (invalidType(name)) {
            throw new IllegalArgumentException(ERROR_TYPE);
        }
        if (invalidLength(name)) {
            throw new IllegalArgumentException(ERROR_LENGTH);
        }
    }

    private boolean invalidType(String name) {
        return !name.replaceAll("[^a-zA-Z가-힣]", "").equals(name);
    }

    private boolean invalidLength(String name) {
        return name.length() < 1;
    }
}
