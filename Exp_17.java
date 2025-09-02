//Experiment 17 : Write a program to use var (Java 10+) for type inference.

public class Exp_17 {
    public static void main(String[] args) {
        var r_number = 7042;          
        var name = "Simran";       
        var marks_1 = 99.99;  
        var marks_2=98.5;       
        var flag = true;         
        
        System.out.println("Roll Number: " + r_number);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks_1);
        System.out.println("Flag: " + flag);

        var sum = marks_1+marks_2;
        System.out.println("Total Marks : "+sum);
    }
}

