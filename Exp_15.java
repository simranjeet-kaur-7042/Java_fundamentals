//Experiment 15 : Write a program to show memory allocation difference between primitive and reference variables.

class Exp_15 {
    public static void main(String[] args) {
        int num = 50;  
        System.out.println("Primitive variable value: " + num);

        String str = new String("Hello");
        System.out.println("Reference variable value: " + str);

        String str2 = str;  
        System.out.println("str2 value (same object as str): " + str2);

        str2 = "World";  
        System.out.println("After modifying str2:");
        System.out.println("str: " + str);
        System.out.println("str2: " + str2);
    }
}
