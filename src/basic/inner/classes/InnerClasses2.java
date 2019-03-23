package basic.inner.classes;

public class InnerClasses2 {
    public static void main(String[] args) {
        OuterDemo3 outerDemo = new OuterDemo3();

        //Get private property of the outer class via a method inside the basic.inner class
        OuterDemo3.InnerDemoPublic innerDemoPublic = outerDemo.new InnerDemoPublic();
        System.out.println(innerDemoPublic.getNum());
    }
}

class OuterDemo3 {
    private int num = 23;

    public class InnerDemoPublic {
        private void print() {
            System.out.println("InnerDemoPublic print");
        }

        public int getNum() {
            System.out.println("This is the getnum method of the basic.inner class");
            return num;
        }
    }
}