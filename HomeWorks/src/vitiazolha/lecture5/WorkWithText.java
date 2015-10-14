package vitiazolha.lecture5;

import java.util.LinkedList;

/**
 * Created by vitiazolha on 05.10.15.
 */
public class WorkWithText {
    static final byte N = 45;

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
        builder.append("|____________________|___________________________________|____________|\n\n");
        return builder.toString();
    }

    public static String encryptText (String text){

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < text.length(); i++)
        {
            int num = (int)(text.charAt(i));
            builder.append((char)(num + N ));
        }
        return builder.toString();
    }


    public static String decryptText (String text){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < text.length(); i++)
        {
            int num = (int)(text.charAt(i));
            builder.append((char)(num - N));
        }
        return builder.toString();
    }
}
