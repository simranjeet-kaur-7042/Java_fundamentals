//Experiment 9 : Write a program to demonstrate autoboxing and unboxing
public class Exp_9 {
    public static void main(String[] args) {
        // Autoboxing: primitive int → Integer object
        int a = 10;
        Integer obj = a; 
        // Unboxing: Integer object → primitive int
        int b = obj; 
        System.out.println("Autoboxed value: " + obj);
        System.out.println("Unboxed value: " + b);
    }
}
