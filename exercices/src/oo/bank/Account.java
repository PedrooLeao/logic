package oo.bank;

import java.math.BigDecimal;

public class Account extends Bank {

    private String name;
    private String accountNumber;
    private BigDecimal balance;


    public Account(String name, String accountNumber, BigDecimal balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void deposit(BigDecimal value) {
        this.balance = this.balance.add(value);
    }
    public void withdraw(BigDecimal value) {
        this.balance = this.balance.subtract(value);
    }

    public void transfer(BigDecimal value, Account secondAccount){
        if (this.balance.compareTo(value) < 0){
            System.out.println("Error: Insufficient funds.");
        } else {
            this.balance = this.balance.subtract(value);
            secondAccount.balance = secondAccount.balance.add(value);
            System.out.println();
        }
    }
    public String getAccountInfo() {
        return "Name: " + getName() + ", Account Number: " + getAccountNumber()+ ", Balance: " + getBalance();
    }

}
