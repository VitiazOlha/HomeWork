package vitiazolha.lecture7;

/**
 * Created by vitiazolha on 17.09.15.
 */
public class DigitInStringException extends Exception {
    @Override
    public String getMessage() {
        return "You string get only digits";
    }
}
