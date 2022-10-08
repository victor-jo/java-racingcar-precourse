package racingcar;

public class StringCommaAppender {

    private static final String COMMA = ",";
    private StringBuilder sb;

    public StringCommaAppender(String str) {
        sb = new StringBuilder(str);
    }

    public void append(String str) {
        sb.append(COMMA)
            .append(str);
    }

    public String get() {
        if (sb.toString().startsWith(COMMA)) {
            sb = new StringBuilder(sb.substring(1));
        }
        return sb.toString();
    }
}
