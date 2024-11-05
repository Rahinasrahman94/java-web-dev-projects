package org.launchcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
         flavors.sort(new FlavorComparator());
        //for() cones.sort(new )
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
for(int i=0;i<flavors.size();i++)
{
    System.out.println(flavors.get(i));//getAllergens()
}
          cones.sort(new ConeComparator());
        System.out.println("-------------------");
        for(int i=0;i<cones.size();i++)
        {
            System.out.println(cones.get(i).getCost());
        }
        for(int i=0;i<toppings.size();i++)
        {
            System.out.println(toppings.get(i).getName());
        }
        toppings.sort(new ToppingComparator());
        System.out.println("---------");
        for(int i=0;i<toppings.size();i++)
        {
            System.out.println(toppings.get(i).getName());
        }


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}