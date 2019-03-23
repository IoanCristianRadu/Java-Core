package basic.methods;

public class Finalize {

    public static void main(String[] george){
        MyDestruction myDestruction = new MyDestruction();
        myDestruction = null;
    }
}

class MyDestruction{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("I will be called just before my final destruction by the garbage collector");
        super.finalize();
    }
}
