package modifiers.nonaccess;

public class Volatile {
    // The volatile modifier is used to let the JVM know that a thread accessing the variable
    // must always merge its own private copy of the variable with the master copy in the memory.
}



// Usually, run() is called in one thread (the one you start using the Runnable), and stop() is called from another thread.
// If in line 1, the cached value of active is used, the loop may not stop when you set active to false in line 2.
// That's when you want to use volatile.
class MyRunnable implements Runnable {
    private volatile boolean active;

    public void run() {
        active = true;
        while (active) {   // line 1
            // some code here
        }
    }

    public void stop() {
        active = false;   // line 2
    }
}