package basic.operators;

public class Operators {
    /*
        Arithmetic Operators
        Relational Operators
        Bitwise Operators
        Logical Operators
        Assignment Operators
        Misc Operators
     */
    public static void main(String[] args) {
        //Arithmetic basic.operators
        System.out.println("Arithmetic basic.operators");
        int a = 1, b = 2;
        System.out.println("a + b:" + a + b + " -> a and b became strings"); // becomes string
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(++a);
        System.out.println(b--); // Value is never used

        //Relational basic.operators
        System.out.println("\nRelational basic.operators");
        int A = 10, B = 20;
        System.out.println(A == B);
        System.out.println(A != B);
        System.out.println(A > B);
        System.out.println(A < B);
        System.out.println(A >= B);
        System.out.println(A <= B);

        // Bitwise basic.operators
        // Bitwise operator works on bits and performs bit-by-bit operation which can be applied to the integer types byte, short, int, long, char
        a = 60;
        b = 13;
        System.out.println("\nBitwise basic.operators");
        System.out.println("a = 0011 1100");
        System.out.println("b = 0000 1101");
        System.out.println("a&b = 0000 1100\n" +
                "\n" +
                "a|b = 0011 1101\n" +
                "\n" +
                "a^b = 0011 0001\n" +
                "\n" +
                "~a  = 1100 0011");
        System.out.println(~a); //( ~a ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.
        System.out.println(a << 2); // a << 2 will give 240 which is 1111 0000
        System.out.println(a >> 2); // a >> 2 will give 15 which is 1111
        System.out.println(a >>> 2); // a >>>2 will give 15 which is 0000 1111

        //Logical basic.operators
        System.out.println("\nLogical basic.operators");
        boolean t=true,f=false;

        System.out.println(t&&f);
        System.out.println(t||f);
        System.out.println(!(t&&f));

        // Assignment basic.operators
        // = , += , >>=, etc

        //Miscellaneous basic.operators
        // ? :
        // basic.variable x = (expression) ? value if true : value if false
        System.out.println("\n Miscellaneous basic.operators:\n:?");
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );


        // instanceof
        // If the object referred by the basic.variable on the left side of the operator passes the IS-A check for the class/interface type on the right side, then the result will be true.
        System.out.println("\nInstanceof");
        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );

    }
}
