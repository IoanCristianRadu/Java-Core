package modifiers.nonaccess;

import java.sql.SQLOutput;

public class NonAccessModifiers {

    // static -> methods && variables

    // final -> classes, methods && variables
    // Final classes cannot be subclassed. Final methods cannot be overridden by any subclasses. Final variables cannot be changed.

    // abstract -> classes, methods
    // Abstract classes can never be instantiated. Abstract methods must be overridden in the subclass.
    // Abstract classes can contain normal methods as well as abstract methods. It can also contain non static/final variables (unlike interfaces).
    // Abstract classes do not need to contain abstract methods.

    // synchronized and volatile -> threads
    // Synchronized -> method can be accessed by ONLY ONE THREAD at a time

    // Reports methods declared final and static. When a static method is overridden in a subclass it can still be accessed via the super class, making a final declaration not very necessary.
    // Declaring a static method final does prevent subclasses from defining a static method with the same signature.
    public synchronized static final void showDetails(){

    }

    // An instance variable is marked transient to indicate the JVM to skip the particular variable when serializing the object containing it.
    public transient int limit = 55;   // will not persist
    public int b;   // will persist

}
