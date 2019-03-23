package basic.modifiers.nonaccess;

public class NonAccessModifiers {

    // static -> basic.methods && variables

    // final -> classes, basic.methods && variables
    // Final classes cannot be subclassed. Final basic.methods cannot be overridden by any subclasses. Final variables cannot be changed.

    // abstract -> classes, basic.methods
    // Abstract classes can never be instantiated. Abstract basic.methods must be overridden in the subclass.
    // Abstract classes can contain normal basic.methods as well as abstract basic.methods. It can also contain non static/final variables (unlike interfaces).
    // Abstract classes do not need to contain abstract basic.methods.

    // synchronized and volatile -> threads
    // Synchronized -> method can be accessed by ONLY ONE THREAD at a time

    // Reports basic.methods declared final and static. When a static method is overridden in a subclass it can still be accessed via the super class, making a final declaration not very necessary.
    // Declaring a static method final does prevent subclasses from defining a static method with the same signature.
    public synchronized static final void showDetails(){

    }

    // An instance basic.variable is marked transient to indicate the JVM to skip the particular basic.variable when serializing the object containing it.
    public transient int limit = 55;   // will not persist
    public int b;   // will persist

}
