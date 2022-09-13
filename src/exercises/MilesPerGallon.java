package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles did you drive?");
        double milesDriven = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        double gallonsUsed = input.nextDouble();

        double mpg = milesDriven / gallonsUsed;
        System.out.println("Your current efficiency is " + mpg + "1 miles-per-gallon.");
    }

}
