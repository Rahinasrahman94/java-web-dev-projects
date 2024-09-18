package org.launchcode;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the length and breadth");
        double length = input.nextDouble();
        double breadth = input.nextDouble();
        double area = length * breadth;
        System.out.println("Area of the reactangle is " + area);
    }
}
