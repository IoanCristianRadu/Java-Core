package basic.exceptions.bankingapp;

public class MyUser {
    private String name;

    public MyUser(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double ammount) {
        MyBank.deposit(this, ammount);
    }

    public void withdraw(double ammount) {
        MyBank.withdraw(this, ammount);
    }
}
