package com.junia.class1;

import com.junia.class1.exceptions.InsufficientBalanceException;
import com.junia.class1.exceptions.InvalidAmountException;

public class Main {
    public static void main(String[] args) {
        BankAccount account =
                new BankAccount("FR001", "Alice", 1000);

        try {

            account.deposit(500);
            account.withdraw(200);

            System.out.println(
                    "Balance: " + account.getBalance()
            );

            account.withdraw(2000);

        } catch (InvalidAmountException e) {

            System.out.println(
                    "Invalid amount: " + e.getMessage()
            );

        } catch (InsufficientBalanceException e) {

            System.out.println(
                    "Transaction refused: " + e.getMessage()
            );
        }
    }
}
