package basic.data.types;

public class MyString {
    public static void main(String[] args){
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println( helloString );

        // Unlike Strings, objects of type StringBuffer and String builder can be modified over and over again 
        // without leaving behind a lot of new unused objects.
        // It is recommended to use StringBuilder whenever possible because it is faster than StringBuffer.
        // However, if the thread safety is necessary, the best option is StringBuffer objects.

        StringBuffer stringBuffer = new StringBuffer("test");
        stringBuffer.append(" String buffer");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("a");
        stringBuilder.append(" b c d");
        System.out.println(stringBuilder);

        //Printing
        float floatVar = 52.2f;
        int intVar = 12;
        String stringVar = "Dog";
        System.out.printf("The value of the float basic.variable is " +
                "%f, while the value of the integer " +
                "basic.variable is %d, and the string " +
                "is %s\n", floatVar, intVar, stringVar);

        String format = String.format("The value of the float basic.variable is " +
                "%f, while the value of the integer " +
                "basic.variable is %d, and the string " +
                "is %s\n", floatVar, intVar, stringVar);
        System.out.println(format);
    }
}
