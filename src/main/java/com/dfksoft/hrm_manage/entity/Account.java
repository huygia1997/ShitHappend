package com.dfksoft.hrm_manage.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {

    @EmbeddedId
    private AccountId id;

    @Column(name = "password")
    private String password;

    @Column(name = "role_id")
    private int role_id;

//    @ManyToOne
//    @JoinColumn(name = "role_id", insertable = false, updatable = false)
//    private Roles roles;
//
//    public Roles getRoles() {
//        return roles;
//    }

    public Account() {
    }

    public AccountId getId() {
        return id;
    }

    public void setId(AccountId id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }
}
