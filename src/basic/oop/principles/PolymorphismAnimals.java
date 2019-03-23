package basic.oop.principles;

import java.util.ArrayList;

interface Mammal {
    public String name = "George"; // Is secretly final
    static int myStatic = 5;
    final int myFinal = 10;

    public void run();

    public String getName();

    // abstract String abstractGetName();

    public static void writeName() {
        System.out.println(name);
    }
} // All attributes are either static or final, and everything must be public.
// Interface basic.methods are imherently abstract, you dont have to write the keyword

class Dog implements Mammal {

    @Override
    public void run() {
        System.out.println("Doggy runs");

    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Cat implements Mammal {

    @Override
    public void run() {
        System.out.println("Kitty runs");
    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Dalmatian extends Dog implements Mammal { // Dog implements mammal too
    private String dalmatianText;

    public Dalmatian(String dalmatianText) {
        super();
        this.dalmatianText = dalmatianText;
    }

    public String getDalmatianText() {
        return dalmatianText;
    }

    public void setDalmatianText(String dalmatianText) {
        this.dalmatianText = dalmatianText;
    }

}

public class PolymorphismAnimals {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Dalmatian dal = new Dalmatian("Dalmatians are special");

        ArrayList<Mammal> mammalList = new ArrayList<Mammal>();
        mammalList.add(d);
        mammalList.add(c);
        mammalList.add(dal);

        mammalList.stream().filter(p -> p.myStatic == 5).map(p -> p.getName())
                .forEach(name -> System.out.println(name));

        Mammal m = d;
        m.run();

    }
}
