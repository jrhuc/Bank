package org.example;

public class BankAccount {
    protected float balance;
    protected float minimumBalance;
    protected String accountHolderName;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(float minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public BankAccount(float balance, float minimumBalance, String accountHolderName) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(float deposit) {
        setBalance(getBalance()+deposit);
    }

    public void withdraw(float withdraw) {
        setBalance(getBalance()-withdraw);
    }


}
