package vitiazolha.lecture5;

import java.util.ArrayList;

/**
 * Created by vitiazolha on 29.09.15.
 */
public class Main {
    public static void main(String[] args)  {
        createList();

    }
//обработка здесь
    public static void createList() {//ToAsk
            ArrayList<Shape> figures = new ArrayList<Shape>();
        try {

            figures.add(new Circle(5));
            figures.add(new Rectangle(3, 4));
            figures.add(new Triangle2SideSin( 3, 4, 90));
            figures.add(new Triangle3Side( 3, 4, 5));
            figures.add(new TriangleSideHeight(3, 5));


        } catch (ValueException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            imageTable(figures);
            setTableInString(figures);
        }
    }

    public static void imageTable(ArrayList<Shape> figures) {
        System.out.print("_______________________________________________________________________\n");
        System.out.print("| Name of the figure |             Arguments             |   Square   |\n");
        System.out.print("|--------------------|-----------------------------------|------------|\n");
        for (Shape e1 : figures)
            System.out.print(e1.toString());
        System.out.print("|_____________________________________________________________________|\n");
    }

    public static void setTableInString(ArrayList<Shape> figures) {
        StringBuilder builder = new StringBuilder();
        builder.append("_______________________________________________________________________\n");
        builder.append("| Name of the figure |             Arguments             |   Square   |\n");
        builder.append("|--------------------|-----------------------------------|------------|\n");
        for (Shape e1 : figures)
            builder.append(e1.toString());
        builder.append("|_____________________________________________________________________|\n\n");
        System.out.print(builder.toString());
    }

}
