package variable.types;

public class VariableTypes {
    public static void main(String[] args) {
        int a, b, c;         // Declares three ints, a, b, and c.
        int d = 10, e = 10;  // Example of initialization
        byte B = 22;         // initializes a byte type variable B.
        double pi = 3.14159; // declares and assigns a value of PI.
        char car = 'a';      // the char variable a is initialized with value 'a'

        /*
            There are 3 types of variables:
            Local variables - in methods
            Instance variables
            Class/Static variables

            There is no default value for local variables, so local variables should be declared and 
            an initial value should be assigned before the first use.
            Access modifiers cannot be used for local variables.
        */

        // Normally you can call methods inside other methods, but they only run if the class has been instantiated.
        // Because this is main() we have to create an instance of the class in order to use the method pupAge()
        VariableTypes variableTypes = new VariableTypes();
        variableTypes.pupAge();
    }
    public void pupAge() {
        System.out.println("Puppy age is: 7");
    }
}
