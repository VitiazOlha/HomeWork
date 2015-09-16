package vitiazolha.lecture6;

import java.util.Arrays;

/**
 * Created by vitiazolha on 13.09.15.
 * min  max
 * sort
 */
public class WorkWithArray {
    static final int NUM = 10;

    public static void main(String[] args) {

        int[] array1 = new int [NUM];
        inputArray(array1);
        outputArray(array1);
        System.out.println("Max value in array = " + findMax(array1));
        System.out.println("Min value in array = " + findMin(array1));
        insertSort(array1);
        outputArray(array1);
    }

    public static void outputArray(int[] array) {
        //for(int i = 0; i < NUM; i++) System.out.print(array[i] + " ");
        System.out.println(Arrays.toString(array));
    }

    public static int[] inputArray(int[] array) {
        for(int i = 0; i < NUM; i++) array[i] = (int) ( Math.random() * 100 - 50 ) ;
        return array;
    }

    public static int findMax(int[] array) {
        int indexMax = 0;
        for (int i = 1; i < NUM; i++)
            if (array[indexMax] < array[i]) indexMax = i;
        return array[indexMax];
    }

    public static int findMin(int[] array) {
        int indexMin = 0;
        for (int i = 1; i < NUM; i++)
            if (array[indexMin] > array[i]) indexMin = i;
        return array[indexMin];
    }

    public static int[] insertSort(int[] array) {
        int jSort;
        int value;
        for (int iSort = 1; iSort < NUM; iSort++)
        {
            jSort = iSort;
            value = array[jSort];
            for (;(jSort != 0) && (value < array[jSort - 1]);)
            {
                array[jSort] = array[jSort - 1];
                jSort--;
            }
            array[jSort] = value;
        }
        return array;
    }
}
