package basic.oop.principles;

public class Inheritance2 {

    public static void main(String[] args) {
        B.eat();
    }
}

class A {
    protected static void eat() {
        System.out.println("A eats");
    }
}

class B extends A {
    /*
    protected static void eat(){
        System.out.println("B eats");
    }
    */
}
