package basic.exceptions.bankingapp;

public class Tester {
    public static void main(String[] args) {
        MyUser george = new MyUser("George");
        george.deposit(200);
        george.withdraw(100);
        george.withdraw(100);
        george.withdraw(100);
    }
}
