package com.dfksoft.hrm_manage.repository;

import com.dfksoft.hrm_manage.entity.Account;
import com.dfksoft.hrm_manage.entity.AccountId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, AccountId> {
    Account findAccountById(AccountId accountId);

    void deleteById(AccountId accountId);
}
