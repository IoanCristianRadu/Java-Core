package basic.inner.classes;

public class InnerClasses {
    public static void main(String[] args) {
        //Use a method to interact with the private basic.inner class
        OuterDemo outerDemo = new OuterDemo();
        outerDemo.display_Inner();
    }
}

class OuterDemo {
    private int num = 23;

    private class InnerDemoPrivate {
        private void print() {
            System.out.println("This is an basic.inner class");
        }
    }

    // Accessing he basic.inner class from the method within
    void display_Inner() {
        InnerDemoPrivate inner = new InnerDemoPrivate();
        inner.print();
    }
}