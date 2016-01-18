package ua.artcode.week1.day1.test;

import ua.artcode.utils.ArrayUtils;

import static ua.artcode.utils.ArrayUtils.*;


public class TestArrayUtils {
	
	public static void main(String[] args) {
		int[] mas = {2,6,4,1,7,-5,9,-1,10};
		
		System.out.println(ArrayUtils.toString(mas));
		System.out.println(ArrayUtils.indexOf(mas,1));
		System.out.println(ArrayUtils.min(mas));
		System.out.println(ArrayUtils.lastIndexOf(mas,1));
		System.out.println(ArrayUtils.revert(mas));
		
				}

}
