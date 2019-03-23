package basic.boxingUnboxing;

public class BoxingUnboxing {
    public static void main(String[] args) {
        // char 'a' is boxed into the Character object
        Character character = 'a';

        // return is unboxed to char 'c'
        char c = new Character('x');
    }
}
