package ua.artcode.week1.home;

public class MyNumber {// Calculator

    private double value;



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
   
    public double factorial(){
    	if (this.value == 0 || this.value == 1)
    	return this.value;
    	double res = this.value;
    //	MyNumber one = new MyNumber(1);
    	for (int i = 2; i < this.value; i++)
    	res *= i;
    	return res;
    }
    public MyNumber rest(MyNumber other){
        return new MyNumber(this.value % other.value);
    }

    public String compare (MyNumber other){
        if (this.value > other.value)
            return this.value + " is bigger than " + other.value;
        if (this.value < other.value)
            return other.value + " is bigger than " + this.value;
        return other.value + " equals " + this.value;
    }

    public double getValue() {
        return value;
    }

    // to check with Serhii
    /*
     * 
    private boolean test;

    public MyNumber(boolean test){
    	this.test = test;
    }
            
    private boolean smaller(MyNumber other) {
		return (this.value < other.value);
			}
    
    public MyNumber factorial1(){
    	MyNumber res = new MyNumber (this.value);
    	if (res.value == 0 || res.value == 1)
    	return res;
     	MyNumber one = new MyNumber(1);
    	for (MyNumber i = new MyNumber(2); i.smaller(res); i.add(one))
    	res = res.multiply(i);
    	return res;
    }
    */


    
}


//for (MyNumber i = 2; i<other.value; i++) return new MyNumber(other.value = other.value*(other.value*(i-1))

//if (this.value == 0 || this.value == 1)
//return this.value;
//MyNumber res = new MyNumber(1);
//for (MyNumber i = 2; i<=res; i++)
// res *= i;
//return res;

