package vitiazolha.lecture5;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by vitiazolha on 02.10.15.
 */
public class WorkWithList {

    public static boolean dialogWindow(LinkedList<Shape> figures) throws ValueException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What do you want to do with list(Enter number 1..7): ");
        byte menuChoise;
        try {
            menuChoise = Byte.parseByte(scanner.nextLine());
        }
        catch (NumberFormatException e) {
            throw new ValueException();
        }
        //todo если возникает ошибка при инициализации фигуры, то удалять фигуру
        switch (menuChoise) {
            case 1: figures.addLast(new Circle());
                figures.getLast().setInfo();
                break;
            case 2: figures.addLast(new Rectangle());
                figures.getLast().setInfo();
                break;
            case 3: figures.addLast(new Triangle2SideSin());
                figures.getLast().setInfo();
                break;
            case 4: figures.addLast(new Triangle3Side());
                figures.getLast().setInfo();
                break;
            case 5: figures.addLast(new TriangleSideHeight());
                figures.getLast().setInfo();
                break;
            case 6: System.out.print(WorkWithText.setTableInString(figures));
                break;
            case 7: return false;
            default:
                System.out.println("Wrong value.");
                break;
        }
        return true;
    }
}
