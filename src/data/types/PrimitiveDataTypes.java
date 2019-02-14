package data.types;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        // LOCAL VARIABLES DO NOT HAVE DEFAULTS

        // byte = 8 bit signed (-2^7) (2^7 -1)
        // Default value 0
        // USE: Save space instead of int
        byte b = 127;
        b = -128;

        // short = 16 bit signed (-2^15) (2^15 -1)
        // Default value 0
        // USE: Save space instead of int
        short s = -32768;
        s = 32767;

        // int = 32 bit signed (-2^31) (2^31 -1)
        // Default value 0
        // USE: Integer is generally used as the default data type for integral values
        // unless there is a concern about memory.
        int i = -2147483648;
        i = 2147483647;

        // long = 64 bit signed (-2^63) (2^63 -1)
        // Default value 0L
        // USE: When a wider range than int is needed
        long l = 1000L;

        // float = 32 bit floating point
        // Default value 0.0f
        // USE: To save memory in large arrays of floating point numbers
        // Float data type is never used for precise values such as currency
        float f = 0.5f;

        // double = 64 bit floating point
        // Default value 0.0d
        // USE: As the default data type for decimal values generally the default choice
        // Double data type should never be used for precise values such as currency
        double d = 123.4; // The compiler has double set as implicit, that is why we dont write 123.4d

        // boolean = 1 bit of information
        // Default value false
        boolean bool = true;

        // char = 16 bit unicode character
        // Minimum value '\u0000' (or 0)
        // Maximum value '\uffff' (or 65,535 inclusive)
        char letterJ = '\u0234';

        System.out.println(letterJ);

        // Prefix 0 is used to indicate octal, and prefix 0x indicates hexadecimal (base 16) when using these number systems for literals. For example −
        int decimal = 100;
        int octal = 0144;
        int hexa = 0x64;
        long longie = 1000L;
        float floatie = 0.5f;
        char charlie = '\u0234';

        char a = 'a';
        String string = "\u3452 \u3456";
        System.out.println(string);
    }
}
