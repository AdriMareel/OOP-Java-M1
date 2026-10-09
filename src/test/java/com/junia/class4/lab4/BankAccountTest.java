package com.junia.class4.lab4;

import com.junia.class1.BankAccount;
import com.junia.class1.exceptions.InsufficientBalanceException;
import com.junia.class1.exceptions.InvalidAmountException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        // Arrange: account with €1000 (setUp)
        account = new BankAccount("ACC001", "Alice", 1000);
    }

    @Test
    void depositIncreasesBalance() throws InvalidAmountException {

        // Act
        account.deposit(200);

        // Assert
        assertEquals(1200, account.getBalance(), 0.001);
    }

    @Test
    void withdrawalDecreasesBalance() throws InsufficientBalanceException, InvalidAmountException {
        // Act
        account.withdraw(300);

        // Assert
        assertEquals(700, account.getBalance(), 0.001);
    }

    @Test
    void newAccountHasCorrectOwnerAndAccountNumber() {
        // Arrange
        BankAccount newAccount = new BankAccount("ACC042", "Bob", 50);

        // Act
        String owner = newAccount.getOwner();
        String accountNumber = newAccount.getAccountNumber();

        // Assert
        assertEquals("Bob", owner);
        assertEquals("ACC042", accountNumber);
    }

    @Test
    void withdrawingExactBalanceLeavesZero() throws InsufficientBalanceException, InvalidAmountException {
        // Act
        account.withdraw(1000);

        // Assert
        assertEquals(0, account.getBalance(), 0.001);
    }

    @Test
    void depositOfZeroIsRefused() {
        // Act + Assert
        assertThrows(InvalidAmountException.class, () -> account.deposit(0));
    }

    @Test
    void withdrawalOfZeroIsRefused() {
        // Act + Assert
        assertThrows(InvalidAmountException.class, () -> account.withdraw(0));
    }

    @Test
    void negativeDepositIsRefused() {
        // Act
        InvalidAmountException exception = assertThrows(
                InvalidAmountException.class,
                () -> account.deposit(-50)
        );

        // Assert
        assertEquals("Deposit amount must be greater than 0.", exception.getMessage());
    }

    @Test
    void negativeWithdrawalIsRefused() {
        // Act + Assert
        assertThrows(InvalidAmountException.class, () -> account.withdraw(-50));
    }

    @Test
    void withdrawalAboveBalanceIsRefused() {
        // Act
        InsufficientBalanceException exception = assertThrows(
                InsufficientBalanceException.class,
                () -> account.withdraw(2000)
        );

        // Assert
        assertEquals("Insufficient balance.", exception.getMessage());
    }

    @Test
    void refusedWithdrawalDoesNotChangeBalance() {
        // Act
        assertThrows(InsufficientBalanceException.class, () -> account.withdraw(2000));

        // Assert
        assertEquals(1000, account.getBalance(), 0.001);
    }

    @Test
    void refusedDepositDoesNotChangeBalance() {
        // Act
        assertThrows(InvalidAmountException.class, () -> account.deposit(-50));

        // Assert
        assertEquals(1000, account.getBalance(), 0.001);
    }
}
