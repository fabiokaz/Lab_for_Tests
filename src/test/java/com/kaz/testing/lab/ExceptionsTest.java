package com.kaz.testing.lab;

import com.kaz.testing.lab.model.Account;
import com.kaz.testing.lab.service.AccountTransfer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {

    @Test
    void validadeExceptionOnTransferAmount(){
        Account fromAccount = new Account(100, "123456");
        Account toAccount = new Account(0, "654321");

        AccountTransfer accountTransfer = new AccountTransfer();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            accountTransfer.transfer(fromAccount, toAccount, -100);
        });
    }

    @Test
    void validadeExceptionOnTransferOverAmount(){
        Account fromAccount = new Account(100, "123456");
        Account toAccount = new Account(0, "654321");

        AccountTransfer accountTransfer = new AccountTransfer();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            accountTransfer.transfer(fromAccount, toAccount, 200);
        });
    }

    @Test
    void validadeDoesNotThrowOnTransferAmount(){
        Account fromAccount = new Account(100, "123456");
        Account toAccount = new Account(0, "654321");

        AccountTransfer accountTransfer = new AccountTransfer();

        Assertions.assertDoesNotThrow(() -> {
            accountTransfer.transfer(fromAccount, toAccount, 10);
        });
    }
}
