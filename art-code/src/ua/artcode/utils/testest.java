package ua.artcode.utils;

public class testest extends testArrayUtils {

	private	int[] mas = {1,2,3};
    		

	
	/**
	 * @return the mas
	 */
	public int[] getMas() {
		return mas;
	}



	/**
	 * @param mas the mas to set
	 */
	public void setMas(int[] mas) {
		this.mas = mas;
	}



	// int[] -> String
	public static void print(int[] mas){
    	//System.out.println(mas);
    	String output = "";
    	for (int i = 0; i<mas.length; i++)
    		output = output + mas[i];
    	System.out.println(output);
    	//System.out.println(Arrays.toString(mas));

    }

}
