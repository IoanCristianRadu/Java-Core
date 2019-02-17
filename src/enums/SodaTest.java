package enums;

class Soda {
    //NOTE: Enums can be declared as their own or inside a class. Methods, variables, constructors can be defined inside enums as well.
    enum SodaSize {
        SMALL, MEDIUM, LARGE
    }

    SodaSize size;
}


public class SodaTest {
    public static void main(String[] args) {
        Soda soda = new Soda();
        soda.size = Soda.SodaSize.MEDIUM;
        System.out.println("Size : " + soda.size);
    }
}