package ua.artcode.utils;

import ua.artcode.week1.day1.model.Student;

public class IntoStructureProblem {
	//FUNCTIONAL
	//1 group name
	//2 group size
	//3 input n name,age, numbers
	//4 show all in groups
	
	//MODEL -> Data description
	
	// name > string, age > int, phone > string
	
	public static void main (String[] args){
		Student s1 = new Student();
	//	s1.name = "Oleg";
	//	s1.age = 21;
	//	s1.phone= "+38000000";
		
		s1.initStudent("Oleg", 23, "+380000000");
		
		//System.out.println(s1.name + " " + s1.age + " " + s1.phone);
		s1.printInfo();
	}
	}
