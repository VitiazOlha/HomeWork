package vitiazolha.lecture5;

import java.util.LinkedList;

/**
 * Created by vitiazolha on 29.09.15.
 */
public class Main {//обработка здесь
    public static void main(String[] args) {
        LinkedList<Shape> figures = new LinkedList<Shape>();
        WorkWithText.outMenu();
        boolean flag = true;
        while ( flag ) {
            try {
               flag =  WorkWithList.dialogWindow(figures);
            }
            catch (ValueException e){
                System.out.print(e.getMessage());
            }
        }
        String a123 = WorkWithText.encryptText(WorkWithText.setTableInString(figures));
        System.out.println(a123);
        System.out.println(WorkWithText.decryptText(a123));
    }
}