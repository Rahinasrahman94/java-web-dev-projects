package org.launchcode;

public abstract class BaseDisc {

    private double capacity;
    private double laserread;

    public double getLaserread() {
        return laserread;
    }
    public void setLaserread(double laserread) {
        this.laserread = laserread;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public BaseDisc(double capacity, double laserread) {
        this.capacity = capacity;
        this.laserread = laserread;

    }

    abstract void abstrmethod();


}
