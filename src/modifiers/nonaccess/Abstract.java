package modifiers.nonaccess;

public class Abstract {
    public static void main(String args[]){
        SubClass subClass = new SubClass();
        subClass.m();
    }
}

// An abstract class that has no abstract methods is legal.
abstract class MyAbstract{
    public String myString;
}

abstract class SuperClass{
    protected abstract void m();
}

class SubClass extends SuperClass {
    @Override
    protected void m() {
        System.out.println("Am useful");
    }
}
