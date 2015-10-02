package vitiazolha.lecture5;

/**
 * Created by vitiazolha on 29.09.15.
 */
public class ValueException extends Exception {
    @Override
    public String getMessage() {
        return "Illegal value(s).";
    }
}
