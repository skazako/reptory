package ua.artcode.week1.home;

import java.util.Scanner;

/**
 * Created by Sem on 22.01.2016.
 */
public class Calculator {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a value:");
        MyNumber num1 = new MyNumber(scan.nextDouble());

        System.out.println("please enter an operation ( + | - | * | / |):");
        String operator = scan.next();

        System.out.println("please enter a second value:");
        MyNumber num2 = new MyNumber(scan.nextDouble());


        if (operator.equals("+")) {
            System.out.println("Result of selected operation is: " + (num1.add(num2).getValue()));
        }
        if (operator.equals("-")) {
            System.out.println("Result of selected operation is: " + (num1.extract(num2).getValue()));
        }
        if (operator.equals("*")) {
            System.out.println("Result of selected operation is: " + (num1.multiply(num2).getValue()));
        }
        if (operator.equals("/")) {
            System.out.println("Result of selected operation is: " + (num1.divide(num2).getValue()));
        }
        if (!operator.equals("/") && !operator.equals("*") && !operator.equals("-") && !operator.equals("+")) {
            System.out.println("ERROR: Operation not supported. Please rerun the program and specify one of the following operations: ( + | - | * | / |)");
        }
        scan.close();
    }


}
