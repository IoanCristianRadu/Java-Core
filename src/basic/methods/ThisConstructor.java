package basic.methods;

public class ThisConstructor {
}

class Student {
    int age;
    Student() {
        this(20);
    }

    Student(int age) {
        this.age = age;
    }
}
