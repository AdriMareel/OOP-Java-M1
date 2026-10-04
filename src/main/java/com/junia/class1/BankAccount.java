package com.junia.class1;

import com.junia.class1.exceptions.InsufficientBalanceException;
import com.junia.class1.exceptions.InvalidAmountException;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private double balance;
    private static List<String> accountNumbers = new ArrayList<>();

    public BankAccount(
            String accountNumber,
            String owner,
            double initialBalance) {

        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = initialBalance;
        this.accountNumbers.add(accountNumber);
    }

    public void deposit(double amount)
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Deposit amount must be greater than 0."
            );
        }

        balance += amount;
    }

    public boolean withdraw(double amount)
            throws InvalidAmountException,
            InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Withdrawal amount must be greater than 0."
            );
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance."
            );
        }

        balance -= amount;

        return true;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public boolean transferTo(
            BankAccount destination,
            double amount)
            throws InvalidAmountException,
            InsufficientBalanceException {

        if (destination == null) {
            return false;
        }

        if (!this.withdraw(amount)) {
            return false;
        }

        destination.deposit(amount);

        return true;
    }
}
