//Experiment 18 : Write a program to demonstrate numeric overflow in Java.

public class Exp_18 {
    public static void main(String[] args) {
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Maximum int value: " + maxInt);

        int overflowInt = maxInt + 1; 
        System.out.println("After adding 1 (overflow): " + overflowInt);

        byte maxByte = Byte.MAX_VALUE;
        System.out.println("\nMaximum byte value: " + maxByte);

        byte overflowByte = (byte)(maxByte + 1); 
        System.out.println("After adding 1 (overflow): " + overflowByte);
    }
}
