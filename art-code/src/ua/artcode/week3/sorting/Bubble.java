package ua.artcode.week3.sorting;

/**
 * Created by Sem on 04.02.2016.
 */
public class Bubble {

    public static int[] sortBubble(int[] arr) {

        boolean swapped = true;
        int a;

        while (swapped){
            swapped = false;
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    //swapping elements
                    a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;

                    swapped = true;
                }
            }
        }

        return arr;

    }
}

