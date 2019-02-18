package oop.principles;

interface Vegetarian {

}

class Animal {

}

class Deer extends Animal implements Vegetarian {

}

public class Polymorphism {

    public static void main(String[] args) {
        //LEGAL DECLARATIONS
        Deer d = new Deer();

        //SUBTYPING
        Animal a = d;
        Vegetarian v = d;
        Object o = d;
    }
}

/*
The Deer class is polymorphic since it has multiple inheritance:

Deer IS-A Animal
Deer IS-A Vegetarian
Deer IS-A Deer
Deer IS-A Object



In Java, all Java objects are polymorphic since any object will pass the IS-A test for their own type and for the class Object.

Subtyping is a form of polymorphism 
Subtyping = program elements, typically subroutines or functions,
            written to operate on elements of the supertype can also operate on elements of the subtype
*/
