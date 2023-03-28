package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        while ( radius < 0 ) {
            System.out.println("Please enter a valid input for the radius.");
            radius = input.nextDouble();
            if ( radius > 0 ) {
                break;
            }
        }

        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
    }
}


