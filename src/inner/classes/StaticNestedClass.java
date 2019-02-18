package inner.classes;

public class StaticNestedClass {

    static class nestedClass {
        public void myMethod() {
            System.out.println("This is my nested class");
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.nestedClass nestedClass = new StaticNestedClass.nestedClass();
        nestedClass.myMethod();
    }

}
