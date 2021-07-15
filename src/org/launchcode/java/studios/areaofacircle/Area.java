package org.launchcode.java.studios.areaofacircle;
import java.lang.*;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double radius;
        String userRadius;
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("Enter a circle radius:");
            userRadius = input.nextLine();


            if (!checkNum(userRadius)) {
                System.err.println("Error. Input invalid.");
                System.exit(0);
            }

            radius = Double.parseDouble(userRadius);

            if (radius <= 0) {
                System.out.println("Invalid number. Please re-enter a positive number for the radius: ");
            }
        } while (radius <= 0);
            //System.err.println("Error. Input invalid.");
            //System.exit(0);

        System.out.println("The area of your circle with radius " + userRadius + " is " + calculateCircleArea(radius));
        input.close();

    }

    public static double calculateCircleArea(double userRadius) {
        return Math.PI * userRadius * userRadius;
    }

    public static boolean checkNum(String userInput) {
        try
        {
            Double.parseDouble(userInput);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }


}
