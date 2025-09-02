//Experiment 19 : Write a program to check if a long value can be stored in a float variable and display the result.

public class Exp_19 {
    public static void main(String[] args) {
        long longValue = 123456789L;
        float floatValue = longValue;
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);

        if (longValue == (long) floatValue) {
            System.out.println("The long value can be stored in a float.");
        } else {
            System.out.println("Cannot store in float.");
        }
    }
}

