package ua.artcode.week3.sorting;

import java.util.Arrays;

/**
 * Created by Sem on 05.02.2016.
 */
public class TestInsert {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 3;
        arr[1] = 8;
        arr[2] = 28;
        arr[3] = 33;
        arr[4] = 12;
        arr[5] = 0;
        arr[6] = 18;
        arr[7] = 26;
        arr[8] = 21;
        arr[9] = 1;

        long start = System.currentTimeMillis();
        Insert.sortInsert(arr);
        long time = System.currentTimeMillis() - start;
        System.out.println (Arrays.toString(arr).equals("[0, 1, 3, 8, 12, 18, 21, 26, 28, 33]") + " " + Arrays.toString(arr) + " Sorted") ;
        System.out.println("Operation took " + time + "ms");
    }
}
