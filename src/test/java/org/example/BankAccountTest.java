package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount testAccount;

    @BeforeEach
    void setUp() {
        testAccount = new BankAccount(1000,0,"Test Account");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDeposit() {
        float initialBalance = testAccount.getBalance();
        float deposit = 100;
        float expectedValue = initialBalance + deposit;
        testAccount.deposit(deposit);
        float actualValue = testAccount.getBalance();
        assertEquals(expectedValue,actualValue);

    }

    @Test
    void testWithdraw() {
        float initialBalance = testAccount.getBalance();
        float withdraw = 100;
        float expectedValue = initialBalance - withdraw;
        testAccount.withdraw(withdraw);
        float actualValue = testAccount.getBalance();
        assertEquals(expectedValue,actualValue);

    }

    @Test
    void testMinimumBalance() {
        float initialBalance = testAccount.getBalance();
        float withdraw = 1100;
        float expectedValue = initialBalance;
        testAccount.withdraw(withdraw);
        float actualValue = testAccount.getBalance();
        assertEquals(expectedValue,actualValue);
    }

    @Test
    void testNegativeWithdraw() {
        float initialBalance = testAccount.getBalance();
        float withdraw = -100;
        float expectedValue = initialBalance;
        testAccount.withdraw(withdraw);
        float actualValue = testAccount.getBalance();
        assertEquals(expectedValue,actualValue);
    }
    @Test
    void testNegativeDeposit() {
        float initialBalance = testAccount.getBalance();
        float deposit = -100;
        float expectedValue = initialBalance;
        testAccount.deposit(deposit);
        float actualValue = testAccount.getBalance();
        assertEquals(expectedValue,actualValue);
    }
}