package ua.artcode.utils;

/**
 * Created by serhii on 16.01.16.
 */
public class ArrayUtils {

    // int[] -> String
    public static String toString(int[] mas){
    	
    	String output = "";
    	
    	for (int i = 0; i < mas.length; i++)
    		output = output + mas[i] + " ";
        
    	return output;
    }

    public static void print(int[] mas){
    	
    	String output = "";
    	
    	for (int i = 0; i < mas.length; i++)
    		output = output + mas[i] + " ";
    	
    	System.out.println(output);
    	
    }

    public static int min(int[] mas){
        
    	int out = mas[0];
        
    	for (int i = 0; i < mas.length; i++)
        	if (out > mas[i]) out = mas[i];
    	
        return out;
    }

    // find index of first el
    public static int indexOf(int[] target, int el){
    	
    	int out = -1;
    	
    	for (int i = target.length-1; i >= 0; i--)
    		if (target[i] == el) out = i; 
        
    	return out;
    }

    public static int lastIndexOf(int[] target, int el){
    	
    	int out = -1;
    	
    	for (int i = 0; i < target.length; i++)
    		if (target[i] == el) out = i; 
        
    	return out;
    }

    // 1,2,3,4
    public static int[] subarray(int[] mas, int start, int end){
        
    	if (start>end || mas.length <start || mas.length <=end) {
    	return null;
        }
        
    	int[] output = new int[end-start];
        
    	for (int i = 0; i<end-start; i++)
        	output[i]=mas[i+start];
        
    	return output;
    }

    public static int[] revert(int[] mas){
        
    	int[] output = new int[mas.length];
        
    	for (int i = 0; i<mas.length; i++)
        	output[i] = mas[mas.length-i];
    	
    	return null;
    }

    public static int[] sym(int[] a, int[] b){
    	
    	int minLength = a.length;
    	int maxLength = b.length;
    	
    	if (a.length>b.length) minLength = b.length; 
    	if (a.length>b.length) maxLength = a.length;
    	
    	int[] out = new int[maxLength];
    	
    	for (int i = 0; i<minLength; i++)
    		out[i] = a[i]+b[i];
    	
    	for (int i = minLength; i<maxLength; i++)
    		if (a.length==maxLength) out[i] = a[i];
    	
    	for (int i = minLength; i<maxLength; i++)
    		if (b.length==maxLength) out[i] = b[i];
        
    	return out;
    }

    // 1 2 3 4 * 3 = 3 + 6 + 9 + 12 =  30
    public static int multAndSum(int[] a, int operand){
        
    	int sum = 0;
        int out;
        
        for (int i = 0; i<a.length; i++)
        	sum = sum + a[i];
        out=sum*operand;
    	
        return sum;
    }

    public static void sort(int[] mas){
    	//bubble
    }






}