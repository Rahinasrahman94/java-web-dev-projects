package org.launchcode;

public class DVD extends BaseDisc implements OpticalDisc {

    private  String StoringType;

    public String getStoringType() {
        return StoringType;
    }

    public void setStoringType(String storingType) {
        StoringType = storingType;
    }



    public DVD(double capacity, double laserread,String StoringType) {
        super(capacity, laserread);
        this.StoringType = StoringType;
    }


    @Override
    void abstrmethod() {
        System.out.println("abstract method called from dvd");


    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");

    }
    public void  Dvdmetthod()
    {
        System.out.println("DVD Characters");
        System.out.println("Capacity:" +getCapacity());
        System.out.println("LaserRead:" + getLaserread());
        System.out.println("Storage Type:" +getStoringType());
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
