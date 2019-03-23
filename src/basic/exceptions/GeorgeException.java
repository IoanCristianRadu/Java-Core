package basic.exceptions;

public class GeorgeException extends Exception {
    private double amount;

    public GeorgeException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
