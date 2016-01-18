package ua.artcode.week1.day1.model;

/*
 * Declare structure
 */

public class Student {

	public String name;
	public int age;
	public String phone;
	
	public void initStudent (String n, int a, String p) {
		name= n;
		age = a;
		phone = p;
	}
	
	public void printInfo() {
		System.out.println(name + " " + age + " " + phone);
	}

}
