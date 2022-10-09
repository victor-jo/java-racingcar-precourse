package racingcar.util;

public class StringCommaAppender {

    private static final String COMMA = ",";
    private StringBuilder sb;

    public StringCommaAppender(String str) {
        sb = new StringBuilder(str);
    }

    public void append(String str) {
        if (!"".equals(sb.toString())) {
            sb.append(COMMA);
        }
        sb.append(str);
    }

    public String get() {
        return sb.toString();
    }
}
