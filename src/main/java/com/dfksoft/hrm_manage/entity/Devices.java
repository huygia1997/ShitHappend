package com.dfksoft.hrm_manage.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "devices")
public class Devices {
    @EmbeddedId
    private DeviceId id;

    private String address;

    public Devices() {
    }

    public DeviceId getId() {
        return id;
    }

    public void setId(DeviceId id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
