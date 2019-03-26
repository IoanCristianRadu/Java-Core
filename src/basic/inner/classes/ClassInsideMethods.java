package basic.inner.classes;

public class ClassInsideMethods {
    public static void main(String[] args) {
        OuterDemo2 outerDemo = new OuterDemo2();

        //Class inside a method of a class.
        outerDemo.myMethod();
    }
}

class OuterDemo2 {
    private int num = 23;

    void myMethod() {
        class ClassInsideMethod {
            public void print() {
                System.out.println("This is a class inside a method inside a class: " + num);
            }
        }

        ClassInsideMethod classInsideMethod = new ClassInsideMethod();
        classInsideMethod.print();
    }
}
