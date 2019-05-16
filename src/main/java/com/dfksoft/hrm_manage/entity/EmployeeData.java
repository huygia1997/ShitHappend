package com.dfksoft.hrm_manage.entity;

import java.io.Serializable;

public class EmployeeData implements Serializable {
    private Account account;
    private Employees employees;
    private Roles roles;

    public EmployeeData() {
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }
}
