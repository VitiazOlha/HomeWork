package vitiazolha.lecture5;

import java.util.LinkedList;

/**
 * Created by vitiazolha on 29.09.15.
 */
public class Main {//обработка здесь
    /*todo encrypt text with Caesar algorithm
     *todo decrypt text with Caesar algorithm
    * */
    public static void main(String[] args) {
        LinkedList<Shape> figures = new LinkedList<Shape>();
        WorkWithList.outMenu();
        boolean flag = true;
        while ( flag ) {
            try {
               flag =  WorkWithList.dialogWindow(figures);
            }
            catch (ValueException e){
                System.out.print(e.getMessage());
            }
        }
    }
}