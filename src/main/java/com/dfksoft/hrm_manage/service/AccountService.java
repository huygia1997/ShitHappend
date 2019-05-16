package com.dfksoft.hrm_manage.service;

import com.dfksoft.hrm_manage.entity.Account;
import com.dfksoft.hrm_manage.entity.AccountId;
import com.dfksoft.hrm_manage.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccount() {
        return (List<Account>) accountRepository.findAll();
    }

    public void saveAccount(Account user) {
        accountRepository.save(user);
    }

    public void deleteAccount(AccountId accountId) {
        accountRepository.deleteById(accountId);
    }

    public Account findAccountById(AccountId accountId) {
        return accountRepository.findAccountById(accountId);
    }
}
