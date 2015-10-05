package vitiazolha.lecture7;

import java.util.Scanner;

/**
 * Created by vitiazolha on 17.09.15.
 * It`s not homework.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            if (hasStringDigitOnly(scanner.nextLine())) {
                throw new DigitInStringException();
            }
        } catch (DigitInStringException e) {
            System.out.print(e.getMessage());
        }
    }

    public static boolean hasStringDigitOnly(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
