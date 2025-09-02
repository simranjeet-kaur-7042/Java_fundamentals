//Experiment 8 : Write a program to demonstrate implicit and explicit type casting.

public class Exp_8 {
    public static void main(String[] args) {
        //Implicit Casting
        int intVal = 100;
        double doubleVal = intVal; 

        System.out.println("Implicit Casting:");
        System.out.println("int value: " + intVal);
        System.out.println("Converted to double: " + doubleVal);

        //Explicit casting
        double num = 99.99;
        int intNum = (int) num; 

        System.out.println("\nExplicit Casting:");
        System.out.println("double value: " + num);
        System.out.println("Converted to int: " + intNum);
    }
}
