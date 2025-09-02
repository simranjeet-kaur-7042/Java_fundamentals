//Experiment 10 : Write a program to find the area of a circle using a final variable for PI.

import java.util.Scanner;

public class Exp_10 {
    public static void main(String[] args) {
        final double PI = 3.14159;  
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
    }
}

