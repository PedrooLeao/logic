package oo.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List <Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }
    public ArrayList < Account > getAccounts() {
        return (ArrayList<Account>) accounts;
    }
}
