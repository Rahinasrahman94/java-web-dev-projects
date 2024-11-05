package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Case {
    private ArrayList<Flavor> flavors = new ArrayList<>();
    private ArrayList<Cone> cones = new ArrayList<>();
    private ArrayList<Topping> toppings = new ArrayList<>();

    public Case(){
        Cone cone1 = new Cone("Waffle", 1.25, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone2 = new Cone("Sugar", 0.75, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone3 = new Cone("Wafer", 0.50, new ArrayList<>(Arrays.asList( "gluten")));
        Cone cone4 = new Cone("Bowl", 0.05, new ArrayList<>(Arrays.asList( "none")));
        cones.add(cone1);
        cones.add(cone2);
        cones.add(cone3);
        cones.add(cone4);

        Flavor flavor1 = new Flavor("Vanilla", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        Flavor flavor2 = new Flavor("Chocolate", 0.75, new ArrayList<>(Arrays.asList( "dairy")));
        Flavor flavor3 = new Flavor("Red Velvet", 0.85, new ArrayList<>(Arrays.asList( "dairy", "red #5")));
        Flavor flavor4 = new Flavor("Rocky Road", 0.85, new ArrayList<>(Arrays.asList( "dairy", "nuts", "gelatin")));
        Flavor flavor5 = new Flavor("Strawberry Sorbet", 0.50, new ArrayList<>(Arrays.asList( "strawberry")));
        flavors.add(flavor1);
        flavors.add(flavor2);
        flavors.add(flavor3);
        flavors.add(flavor4);
        flavors.add(flavor5);
        Topping topping1 = new Topping("Crushed Nuts",4.00,new ArrayList<>(Arrays.asList( "Nuts")));
        Topping topping2 = new Topping("Sprinkles",3.00,new ArrayList<>(Arrays.asList( "Gluten","red #5","blue #3")));
        Topping topping3 = new Topping("Fresh Fruits",5.00,new ArrayList<>(Arrays.asList( "Strawberry","Peach","Orange")));
        Topping topping4 = new Topping("Hot Fudge",6.00,new ArrayList<>(Arrays.asList( "Chocolate")));
        Topping topping5 = new Topping("Peanut Butter Sauce",7.00,new ArrayList<>(Arrays.asList( "Peanuts")));
        toppings.add(topping1);
        toppings.add(topping2);
        toppings.add(topping3);
        toppings.add(topping4);
        toppings.add(topping5);;
    }

    public ArrayList<Flavor> getFlavors() {
        return flavors;
    }

    public ArrayList<Cone> getCones() {
        return cones;
    }

    public void setFlavors(ArrayList<Flavor> flavors) {
        this.flavors = flavors;
    }

    public void setCones(ArrayList<Cone> cones) {
        this.cones = cones;
    }



    public ArrayList<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Topping> toppings) {
        this.toppings = toppings;
    }
}
