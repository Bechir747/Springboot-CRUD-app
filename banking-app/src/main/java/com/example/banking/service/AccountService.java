package com.example.banking.service;

import com.example.banking.dto.AccountDto;
import com.example.banking.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto  accountDto);

    AccountDto getAccountById(long id);

    AccountDto deposit(long id, double amount);

    AccountDto withdraw(long id, double amount);
    List<AccountDto> getAllAccounts();
    void deleteAccount(long id);

    void deleteAllAccounts();
}
