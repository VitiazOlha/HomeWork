package vitiazolha.lecture5;

import java.io.IOException;
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
        //todo если возникает ошибка при инициализации фигуры, то удалять ее
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
            case 6: System.out.print(setTableInString(figures));
                break;
            case 7: return false;
            default:
                System.out.println("Wrong value.");
                break;
        }
        return true;
    }

    public static void outMenu(){
        System.out.println("1. Add new Circle [R] in list.");
        System.out.println("2. Add new Rectangle [a,b] in list.");
        System.out.println("3. Add new Triangle [a,b,sin] in list.");
        System.out.println("4. Add new Triangle [a,b,c] in list.");
        System.out.println("5. Add new Triangle [a,h] in list.");
        System.out.println("6. Print a table of the elements list.");
        System.out.println("7. Exit.");
    }


    public static String setTableInString(LinkedList<Shape> figures) {
        StringBuilder builder = new StringBuilder();
        builder.append("_______________________________________________________________________\n");
        builder.append("| Name of the figure |             Arguments             |   Square   |\n");
        builder.append("|--------------------|-----------------------------------|------------|\n");
        for (Shape e1 : figures)
            builder.append(e1.toString());
        builder.append("|_____________________________________________________________________|\n\n");
        return builder.toString();
    }
}
