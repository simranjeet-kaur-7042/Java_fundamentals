//Experiment 14 : Write a program to use wrapper class methods to convert numbers to binary and hexadecimal.

import java.util.Scanner;
public class Exp_14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        String binary = Integer.toBinaryString(number);
        String hex = Integer.toHexString(number);

        System.out.println("Number: " + number);
        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hex.toUpperCase());
    }
}
