package oo.bank;

import java.math.BigDecimal;
import java.util.List;


public class TestTransfer {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account a1 = new Account("Pedro Leao", "10001", new BigDecimal("1000"));
        Account a2 = new Account("Isabel Rodrigues", "10002", new BigDecimal("2000"));
        Account a3 = new Account("Anderson Matias", "10003", new BigDecimal("3000"));
        Account a4 = new Account("Tomas Turbano", "10004", new BigDecimal("4000"));

        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.addAccount(a3);
        bank.addAccount(a4);
        List< Account > accounts = bank.getAccounts();

        for (Account account: bank.getAccounts()) {
            System.out.println(account.getAccountInfo());
        }

        a1.deposit(new BigDecimal("1000"));
        System.out.println(a1.getBalance());

        a1.withdraw(new BigDecimal("500"));
        System.out.println(a1.getBalance());

        a1.transfer(new BigDecimal("1500"), a2);

        for (Account account: bank.getAccounts()) {
            System.out.println(account.getAccountInfo());
        }
    }
}
