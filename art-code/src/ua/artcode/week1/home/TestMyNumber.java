package ua.artcode.week1.home;

/**
 * Created by serhii on 17.01.16.
 */
public class TestMyNumber {

    public static void main(String[] args) {

        MyNumber num1 = new MyNumber(6);
        MyNumber num2 = new MyNumber(3);
        

        MyNumber num3 = num1.divide(num2);
        MyNumber num5 = num1.rest(num2);
        MyNumber num6 = num1.add(num2);
        MyNumber num7 = num1.extract(num2);
        MyNumber num8 = num1.multiply(num2);
        MyNumber num9 = num1.power(num2);


        if (num1.compare(num2).equals("6.0 is bigger than 3.0"))
            System.out.println("TEST-OK: " + "compare: " + num1.compare(num2));
        if (!num1.compare(num2).equals("6.0 is bigger than 3.0"))
            System.out.println("ERROR: " + "compare is " + num1.compare(num2) + "but should be '6.0 is bigger than 3.0'");

        if (num5.getValue() == 0)
            System.out.println("TEST-OK: " + "rest: " + num5.getValue());
        if (num5.getValue() != 0)
            System.out.println("ERROR: " + "rest is " + num5.getValue() + " but should be 0.0");

        if (num1.factorial() == 720)
        System.out.println("TEST-OK: " + "factorial: " + num1.factorial());
        if (num1.factorial() != 720)
            System.out.println("ERROR: " + "factorial is " + num1.factorial() + " but should be 720.0");

        if (num9.getValue() == 216)
            System.out.println("TEST-OK: " + "power: " + num9.getValue());
        if (num9.getValue() != 216)
            System.out.println("ERROR: " + "power is " + num9.getValue() + " but should be 216.0");

        if (num3.getValue() == 2)
            System.out.println("TEST-OK: " + "divide: " + num3.getValue());
        if (num3.getValue() != 2)
            System.out.println("ERROR: " + "divide is " + num3.getValue() + " but should be 2.0");

        if (num8.getValue() == 18)
            System.out.println("TEST-OK: " + "multiply: " + num8.getValue());
        if (num8.getValue() != 18)
            System.out.println("ERROR: " + "multiply is " + num8.getValue() + " but should be 18.0");

        if (num7.getValue() == 3)
            System.out.println("TEST-OK: " + "extract: " + num7.getValue());
        if (num7.getValue() != 3)
            System.out.println("ERROR: " + "extract is " + num7.getValue() + " but should be 3.0");

        if (num6.getValue() == 9)
            System.out.println("TEST-OK: " + "add: " + num6.getValue());
        if (num6.getValue() != 9)
            System.out.println("ERROR: " + "add is " + num6.getValue() + " but should be 9.0");
        //MyNumber num4 = num1.factorial1();
        //System.out.println("divide " + num4.getValue());
     
        // int i = 33;
        //
        // myNumber + myNumer = myNumber
        // myNum + 4 = double

    }
}
