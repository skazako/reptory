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

        
        System.out.println("facorial " + num1.factorial());        
        System.out.println("divide " + num3.getValue());
        System.out.println("rest " + num5.getValue());

        //MyNumber num4 = num1.factorial1();
        //System.out.println("divide " + num4.getValue());
     
        // int i = 33;
        //
        // myNumber + myNumer = myNumber
        // myNum + 4 = double

    }
}
