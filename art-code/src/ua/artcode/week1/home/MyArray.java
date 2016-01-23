package ua.artcode.week1.home;

/**
 * Created by Sem on 22.01.2016.
 */
public class MyArray {

    private int[] values;

    public MyArray(int[] values) {
        this.values = values;
    }

    public int min() {
        int out = values[0];
        for (int i = 0; i < values.length; i++)
            if (out > values[i]) out = values[i];
        return out;
    }

    public int max() {
        int out = values[0];
        for (int i = 0; i < values.length; i++)
            if (out < values[i]) out = values[i];
        return out;
    }

    public int[] randArray(int inp) {
        int[] out = new int[inp];
        for (int i = 0; i < out.length; i++)
            out[i] = (int) (Math.random() * inp);
        return out;
    }

    public String toString(){
        String output = "";
        for(int i = 0; i < this.values.length; i++)
            output += this.values[i]+",";
        output = output.substring(0,output.length()-1);
        output = "{" + output + "}";

        return output;
    }

    public int[] getValues() {
        return values;
    }
}
