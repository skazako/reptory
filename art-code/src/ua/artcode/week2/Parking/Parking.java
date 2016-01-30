package ua.artcode.week2.Parking;

/**
 * Created by Sem on 26.01.2016.
 */
public class Parking {

    private String address;
    private boolean isOpen;
    private Place[] places = new Place[10];
    private int placeCount = 0;


    public Parking(String address, boolean isOpen, Place[] places) {
        this.address = address;
        this.isOpen = isOpen;
        this.places = places;
    }

    public Place addMotoOnLastFreePlace(Bike bike){
        if (isOpen()) {
            int freePlaceNew = places[0].getPlaceNum();
            for (int i = places.length; i > 0; i--) {
                if (places[i]==null) freePlaceNew = i;
            }
            Place place = new Place(freePlaceNew, bike);
            places[freePlaceNew] = place;
            placeCount++;
            return place;
        }
        System.out.println("Sorry, we are closed");
        return null;}

    public Bike takeLastMoto(){return null;}


    public void addMotoByPlaceNumber(Bike bike, int placeId) {
        if (isOpen()) {
            if (places[placeId]==null) {
                Place place = new Place(placeId, bike);
                places[placeId] = place;
                placeCount++;
                }
            System.out.println("Sorry, this place is already in use");
        }
        System.out.println("Sorry, we are closed");
    }


    public Bike takeMotoByPlaceNumber(Place place) {return null;}

    public void clearGaragePlaces() {}

    public boolean open() {
        setOpen(true);
        return isOpen();}

    public boolean close() {
        setOpen(false);
        return isOpen();
    }

    public String changeAddress(String newAddress) {
        setAddress(newAddress);
        return getAddress();
    }

    public Place[] showAllInGarage(){
        int counter = 0;
        for (int i = 0; i < this.places.length; i++) {
            if (this.places[i] != null){

                counter++;
            }
        }
        return null;
    }

    //****************************************************************************************************
    public String getAddress() {
        return address;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Place[] getPlaces() {
        return places;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
    //****************************************************************************************************

    /*
    class Parking
           methods
           - addMotoOnLastFreePlace
           - takeLastMoto
           - addMotoByPlaceNumber
           - takeMotoByPlaceNumber
           - clearGaragePlaces
           - open
           - close
           - changeAddress
           - showAllInGarage
     */
}
