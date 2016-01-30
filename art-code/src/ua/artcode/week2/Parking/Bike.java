package ua.artcode.week2.Parking;

/**
 * Created by Sem on 26.01.2016.
 */
public class Bike {

    private String name;
    private int cost;
    private boolean isFixed;

    public Bike(String name, int cost, boolean isFixed) {
        this.name = name;
        this.cost = cost;
        this.isFixed = isFixed;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public boolean isFixed() {
        return isFixed;
    }

    public void setFixed(boolean fixed) {
        isFixed = fixed;
    }

}
