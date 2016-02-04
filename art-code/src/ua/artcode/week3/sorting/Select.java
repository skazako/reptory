package ua.artcode.week3.sorting;

/**
 * Created by Sem on 04.02.2016.
 */
public class Select {
    public static int[] sortSelect (int[] arr) {
        int min;
        int temp = 0;
        int x = 0;
        while (x < arr.length-1){
            min = arr[x];
            for (int i = x; i < arr.length-1; i++) {
                if (min > arr[i + 1]){
                    min = arr[i + 1];
                    temp = i+1;
                }
            }
            if (min == arr[temp]) {
                arr[temp] = arr[x];
            }
            arr[x] = min;
            x++;
        }
        return arr;
    }


}
