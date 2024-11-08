package org.launchcode;

public class Main {
    public static void main(String[] args) {


        // TODO: Declare and initialize a CD and a DVD object.
        CD cd = new CD(638,700,"Audio");
        DVD dvd = new DVD (3500,650,"Video");
        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();
        cd.abstrmethod();
        dvd.abstrmethod();
        cd.Cdmetthod();;
        dvd.Dvdmetthod();

    }
}