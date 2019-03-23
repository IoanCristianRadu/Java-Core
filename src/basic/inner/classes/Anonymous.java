package basic.inner.classes;

public class Anonymous {
    public static void main(String[] args){
        //AnonymousInner
        AnonymousInner inner = new AnonymousInner(){

            @Override
            public void myMethod() {
                System.out.println("Anonymous basic.inner class");
            }
        };

        inner.myMethod();
    }
}

abstract class AnonymousInner {
    public abstract void myMethod();
}