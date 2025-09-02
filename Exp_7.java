// Experiment7 : Write a program to print default values of instance variables in a class.

public class Exp_7 {
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    String stringVar;

    public static void main(String[] args) {
        Exp_7 obj = new Exp_7();
        System.out.println("Default values of instance variables:");
        System.out.println("byte     : " + obj.byteVar);
        System.out.println("short    : " + obj.shortVar);
        System.out.println("int      : " + obj.intVar);
        System.out.println("long     : " + obj.longVar);
        System.out.println("float    : " + obj.floatVar);
        System.out.println("double   : " + obj.doubleVar);
        System.out.println("char     : '" + obj.charVar + "'"); 
        System.out.println("boolean  : " + obj.booleanVar);
        System.out.println("String   : " + obj.stringVar);
    }
}
