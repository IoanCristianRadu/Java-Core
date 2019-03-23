package basic.modifiers.nonaccess;

public class Static {
    private static int numInstances = 0;

    protected static int getCount() {
        return numInstances;
    }

    private static void addInstance() {
        numInstances++;
    }

    Static() {
        Static.addInstance();
    }

    public static void main(String[] arguments) {
        //Because it is static, it exists before instantiating the class.
        System.out.println("Starting with " + Static.getCount() + " instances");

        for (int i = 0; i < 500; ++i) {
            new Static();
        }
        System.out.println("Created " + Static.getCount() + " instances");
    }
}
