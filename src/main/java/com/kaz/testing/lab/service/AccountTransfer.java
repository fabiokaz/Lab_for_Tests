package com.kaz.testing.lab.service;

import com.kaz.testing.lab.model.Account;

public class AccountTransfer {

    public void transfer(Account from, Account to, int amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (from.getBalance() < amount) {
            throw new IllegalArgumentException("Not enough money");
        }
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);
    }
}
