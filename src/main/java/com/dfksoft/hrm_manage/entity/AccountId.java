package com.dfksoft.hrm_manage.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AccountId  implements Serializable {
    @Column(name = "username")
    private String username;

    @Column(name = "mac_address")
    private String macAddress;

    public AccountId() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }
}
