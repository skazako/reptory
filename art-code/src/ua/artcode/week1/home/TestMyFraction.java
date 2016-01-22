package ua.artcode.week1.home;

/**
 * Created by Sem on 21.01.2016.
 */
public class TestMyFraction {
    public static void main(String[] args) {
        MyFraction fract1 = new MyFraction(2,4);
        MyFraction fract2 = new MyFraction(1,3);

        MyFraction fract3 = fract1.add(fract2);
        MyFraction fract4 = fract1.extract(fract2);
        MyFraction fract5 = fract1.multiply(fract2);
        MyFraction fract6 = fract1.divide(fract2);



        //add
        if (fract3.toString().equals("5/6"))
            System.out.println("TEST-OK: " + "add: " + fract3.toString());
        if (!fract3.toString().equals("5/6"))
            System.out.println("ERROR: " + "add is " + fract3.toString() + " but should be: 5/6");

               //extract test
        if (fract4.toString().equals("1/6"))
            System.out.println("TEST-OK: " + "extract: " + fract4.toString());
        if (!fract4.toString().equals("1/6"))
            System.out.println("ERROR: " + "extract is " + fract4.toString() + " but should be: 1/6");

        //multiply test
        if (fract5.toString().equals("1/6"))
            System.out.println("TEST-OK: " + "multiply: " + fract5.toString());
        if (!fract5.toString().equals("1/6"))
            System.out.println("ERROR: " + "multiply is " + fract5.toString() + " but should be: 1/6");

        //divide test
        if (fract6.toString().equals("3/2"))
            System.out.println("TEST-OK: " + "divide: " + fract6.toString());
        if (!fract6.toString().equals("3/2"))
            System.out.println("ERROR: " + "divide is " + fract6.toString() + " but should be: 3/2");

        //compare test
        if (fract1.compare(fract2).equals("2/4 is bigger than 1/3"))
            System.out.println("TEST-OK: " + "compare: " + fract1.compare(fract2));
        if (!fract1.compare(fract2).equals("2/4 is bigger than 1/3"))
            System.out.println("ERROR: " + "compare is " + fract1.compare(fract2) + " but should be: 2/4 is bigger than 1/3");


    }
}
