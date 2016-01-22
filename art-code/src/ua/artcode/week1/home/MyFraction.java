package ua.artcode.week1.home;

/**
 * Created by Sem on 21.01.2016.
 */
public class MyFraction {

    private int numerator;
    private int denominator;

    public MyFraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public String toString(){
        return this.numerator + "/" + this.denominator;
    }

    public MyFraction reduce(MyFraction other){
        int max = 0;
        if (other.numerator > other.denominator)
            max = Math.abs(other.denominator);
        else
            max = Math.abs(other.numerator);
        for (int i = max; i >= 2; i--){
            if ((other.numerator % i == 0) && (other.denominator % i == 0)){
                other.numerator /= i;
                other.denominator /= i;
            }
        }
        if (other.denominator < 0){
            other.numerator = -1 * (other.numerator);
            other.denominator = Math.abs(other.denominator);
        }
        return other;
    }



    public MyFraction add(MyFraction other){
        MyFraction res = new MyFraction(0,0);
        res.numerator = (this.numerator * other.denominator + this.denominator * other.numerator);
        res.denominator = (this.denominator * other.denominator);
        reduce(res);
        return res;
    }

    public MyFraction extract(MyFraction other){
        MyFraction res = new MyFraction(0,0);
        res.numerator = (this.numerator * other.denominator - this.denominator * other.numerator);
        res.denominator = (this.denominator * other.denominator);
        reduce(res);
        return res;
    }

    public MyFraction multiply(MyFraction other){
        MyFraction res = new MyFraction(0,0);
        res.numerator = (this.numerator * other.numerator);
        res.denominator = (this.denominator * other.denominator);
        reduce(res);
        return res;
    }

    public MyFraction divide(MyFraction other){
        MyFraction res = new MyFraction(0,0);
        res.numerator = (this.numerator * other.denominator);
        res.denominator = (this.denominator * other.numerator);
        reduce(res);
        return res;
    }

    public String compare(MyFraction other){
        if ((( this.numerator * 100 ) / this.denominator ) > (( other.numerator * 100 ) / other.denominator ))
            return this.numerator + "/" + this.denominator + " is bigger than " + other.numerator + "/" + other.denominator;
        if ((( this.numerator * 100 ) / this.denominator ) > (( other.numerator  * 100 ) / other.denominator ))
            return other.numerator + "/" + other.denominator + " is bigger than " + this.numerator + "/" + this.denominator;
        return other.numerator + "/" + other.denominator + " equals " + this.numerator + "/" + this.denominator;
    }


/*
    public MyNumber(double value) {
        this.value = value;
    }


    public MyNumber add(MyNumber other){
        return new MyNumber(this.value + other.value);
    }

    public MyNumber extract(MyNumber other){
        return new MyNumber(this.value - other.value);
    }

    public MyNumber multiply(MyNumber other){
        return new MyNumber(this.value * other.value);
    }

    public MyNumber divide(MyNumber other){
        return new MyNumber(this.value / other.value);
    }

    public MyNumber power(MyNumber other){
        return new MyNumber(Math.pow(this.value,other.value));
    }
 */

}
