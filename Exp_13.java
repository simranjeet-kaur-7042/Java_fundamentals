//Experiment 13 :  Write a program to show the difference between static and instance variables.

class Student {
    int rollNo;                     // Instance var
    static String name = "Simran";  // Static var

    Student(int rollNo) {
        this.rollNo = rollNo;
    }
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}
public class Exp_13 {
    public static void main(String[] args) {
        Student s1 = new Student(101);
        Student s2 = new Student(102);
        s1.display();  
        s2.display();  

        // Change static variable
        Student.name = "Mehak";
        s1.display();
        s2.display(); 
    }
}
