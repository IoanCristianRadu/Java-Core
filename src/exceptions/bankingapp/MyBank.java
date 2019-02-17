package exceptions.bankingapp;

import exceptions.bankingapp.exceptions.AccountBalanceNegativeException;
import exceptions.bankingapp.exceptions.NoClientException;

import java.util.HashMap;

public class MyBank {
    private static HashMap<MyUser, Double> clientMap = new HashMap<MyUser, Double>();

    public static void deposit(MyUser client, double ammount) {

        if (clientMap.containsKey(client)) {
            clientMap.put(client, ammount + clientMap.get(client));
            System.out.println("You deposited " + ammount +
                    "$.Your current balance is " + clientMap.get(client) + "$");
        } else {
            clientMap.put(client, ammount);
            System.out.println("You deposited " + ammount +
                    "$.Your current balance is " + clientMap.get(client) + "$");
        }


    }

    public static void withdraw(MyUser client, double ammount) {
        try {
            if (clientMap.get(client) == null) {
                throw new NoClientException();
            }

            double accountBalanceAfterTransaction = clientMap.get(client) - ammount;
            if (accountBalanceAfterTransaction < 0) {
                throw new AccountBalanceNegativeException(accountBalanceAfterTransaction);
            }

            clientMap.put(client, clientMap.get(client) - ammount);
            System.out.println("You withdrew " + ammount +
                    "$.Your current balance is " + clientMap.get(client) + "$");

        } catch (NoClientException e) {
            System.out.println("You do not have a bank account.");
        } catch (AccountBalanceNegativeException e) {
            System.out.println("You are missing " + (-1) * e.getAmmount() + "$");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
