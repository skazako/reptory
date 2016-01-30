package ua.artcode.week2.Parking;

/**
 * Created by Sem on 26.01.2016.
 */
public class Place {
    private int placeNum = 0;
    private Bike bike;

    public Place(int placeNum, Bike bike) {
        this.placeNum = placeNum;
        this.bike = bike;
    }

    public int getPlaceNum() {
        return placeNum;
    }


}
