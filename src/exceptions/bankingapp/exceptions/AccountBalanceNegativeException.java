package exceptions.bankingapp.exceptions;

public class AccountBalanceNegativeException extends Throwable {
    private double ammount;

    public AccountBalanceNegativeException(double ammount){
        this.ammount = ammount;
    }

    public double getAmmount(){
        return ammount;
    }
}
