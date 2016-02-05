package ua.artcode.week3.sorting;

/**
 * Created by Sem on 04.02.2016.
 */
public class Insert {

    public static int[] sortInsert (int[] arr){
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int x;
            for (x = i - 1; x >= 0 && temp < arr[x] ; x--) {
                arr[x + 1] = arr[x];

            }
            arr[x + 1] = temp;
        }
        return arr;
    }

}
