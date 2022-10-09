package racingcar.util;

public class StringCommaAppender extends StringAppender {

    private static final String COMMA = ",";

    public StringCommaAppender(String str) {
        super(str);
    }

    @Override
    public void append(String str) {
        if (!"".equals(get())) {
            super.append(COMMA);
        }
        super.append(str);
    }

    @Override
    public String get() {
        return super.get();
    }
}
