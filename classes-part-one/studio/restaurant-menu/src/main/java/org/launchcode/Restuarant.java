package org.launchcode;

public class Restuarant {

    public static void main(String[] args) {
        MenuItem m1 = new MenuItem("Mac and Cheese","Main Course",3.00,"Pasta with cheese");
        MenuItem m2= new MenuItem("Brownie","Dessert",4.00,"Cocoa and flour");
        MenuItem m3 =new MenuItem("Fried rice","Main  Course",4.00," Stir fried rice and vegetables");
        MenuItem m4 = new MenuItem("Meatballs", "Appetizer", 2.00, "Ground meat rolled into a ball");

        Menu menu = new Menu();
        menu.items.add(m1);
        menu.items.add(m2);
        menu.items.add(m3);
        menu.items.add(m4);
        int lisize = menu.items.size()-1;
        int i=0;
        for(MenuItem item:menu.items)
        {


            System.out.println();

            if(i>=lisize){
                System.out.print("[NEW]");
            }
            System.out.println(item.getCategory());
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
                i++;

        }
        //System.out.println(menu.items.get(menu.items.size()-1));

        }

}

