package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {
    public String getStorageType() {
        return StorageType;
    }

    public void setStorageType(String storageType) {
        StorageType = storageType;
    }

    // TODO: Implement your custom interface.
    private String StorageType;

    public CD(double capacity, double laserread,String StorageType) {
        super(capacity, laserread);
        this.StorageType = StorageType;
    }


    @Override
    void abstrmethod() {
        System.out.println("abstract method called from cd");

    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");

    }
    public void  Cdmetthod()
    {
        System.out.println("CD Characters");
        System.out.println("Capacity:" +getCapacity());
        System.out.println("LaserRead:" + getLaserread());
        System.out.println("Storage Type:" +getStorageType());
    }



    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
