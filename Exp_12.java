//Experiment 12 : Write a program to demonstrate type promotion in arithmetic operations.

public class Exp_12 {
    public static void main(String[] args) {
        byte b = 10;
        int i = 20;
        int result1 = b + i;
        System.out.println("byte + int = " + result1);

        float f = 15.5f;
        long l = 25L;
        float result2 = f + l;
        System.out.println("float + long = " + result2);
    }
}
