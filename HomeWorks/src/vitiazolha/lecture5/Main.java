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
        }
    }

    public static void imageTable(ArrayList<Shape> figures) {
        System.out.print("_______________________________________________________________________\n");
        System.out.print("| Name of the figure |             Arguments             |   Square   |\n");
        System.out.print("|--------------------|-----------------------------------|------------|\n");
        for (Shape e1 : figures)
            /*System.out.println(*/e1.toString();//);
        System.out.print("|_____________________________________________________________________|\n");
    }

}
