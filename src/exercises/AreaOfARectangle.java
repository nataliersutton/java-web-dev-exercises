package exercises;

import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = input.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = input.nextDouble();

        double area = length*width;
        System.out.println("The Area of the Rectangle is: " + area);
    }
}
