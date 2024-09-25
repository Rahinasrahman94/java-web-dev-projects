package org.launchcode;
import java.util.Scanner;

public class GallonsPerMile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Miles and Gallon");
        double miles = input.nextDouble();
        double gallon = input.nextDouble();
        double gasused = miles / gallon;
        System.out.println("GasUsed" + gasused );
    }
}
