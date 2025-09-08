public class OperatorsPractice {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

       
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        
        boolean x = true, y = false;
        System.out.println("\n=== Logical Operators ===");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

  
        System.out.println("\n=== Bitwise Operators ===");
        System.out.println("a & b  = " + (a & b));
        System.out.println("a | b  = " + (a | b));
        System.out.println("a ^ b  = " + (a ^ b));
        System.out.println("~a     = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
        System.out.println("b >>> 2= " + (b >>> 2));

        System.out.println("\n=== Increment / Decrement Operators ===");
        System.out.println("a++ = " + (a++)); 
        System.out.println("Now a = " + a);
        System.out.println("++a = " + (++a)); 
        System.out.println("b-- = " + (b--)); 
        System.out.println("Now b = " + b);
        System.out.println("--b = " + (--b)); 
        
        int c = 5;
        System.out.println("\n=== Assignment Operators ===");
        System.out.println("c = " + c);
        c += 3;
        System.out.println("c += 3 : " + c);
        c -= 2;
        System.out.println("c -= 2 : " + c);
        c *= 4;
        System.out.println("c *= 4 : " + c);
        c /= 2;
        System.out.println("c /= 2 : " + c);
        c %= 3;
        System.out.println("c %= 3 : " + c);
    }
}
