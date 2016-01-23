package ua.artcode.week1.home;

import java.util.Arrays;

/**
 * Created by Sem on 22.01.2016.
 */
    public class TestMyArray {


    public static void main(String[] args) {

        int[] testArr = new int[5];
        testArr[0] = 2;
        testArr[1] = 3;
        testArr[2] = 4;
        testArr[3] = 5;
        testArr[4] = 6;


        MyArray Arr1 = new MyArray(testArr);
        MyArray Arr2 = new MyArray(Arr1.randArray(6));

        if (Arr1.min() == 2)
            System.out.println("TEST-OK: " + "Min: " + Arr1.min());
        if (Arr1.min() != 2)
            System.out.println("ERROR: " + "Min is " + Arr1.min() + " but should be 2");

        if (Arr1.max() == 6)
            System.out.println("TEST-OK: " + "Max: " + Arr1.max());
        if (Arr1.max() != 6)
            System.out.println("ERROR: " + "Max is " + Arr1.max() + " but should be 2");

        System.out.println("Random for array of 6 elements: " + Arr2.toString());


    }


}


