//Experiment 5 : Write a program to find the ASCII value of a character.

import java.util.Scanner;
public class Exp_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0); 

        int ascii = (int) ch;
        System.out.println("Character: " + ch);
        System.out.println("ASCII value: " + ascii);
    }
}

