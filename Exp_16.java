//Experiment 16 : Write a program to demonstrate the use of a static final variable (constant).

public class Exp_16 {
    static final double PI = 3.14159;

    public static void main(String[] args) {
        double radius = 7.0;
        double area = PI * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area of circle: " + area);
    }
}
