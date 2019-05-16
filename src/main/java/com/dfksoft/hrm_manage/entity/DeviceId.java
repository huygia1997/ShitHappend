package com.dfksoft.hrm_manage.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class DeviceId implements Serializable {
    @Column(name = "name")
    private String name;

    @Column(name = "mac_device")
    private String macDevice;

    public DeviceId() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMacDevice() {
        return macDevice;
    }

    public void setMacDevice(String macDevice) {
        this.macDevice = macDevice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeviceId)) return false;
        DeviceId that = (DeviceId) o;
        return Objects.equals(getMacDevice(), that.getMacDevice()) &&
                Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMacDevice(), getName());
    }
}
