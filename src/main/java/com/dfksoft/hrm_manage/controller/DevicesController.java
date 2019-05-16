package com.dfksoft.hrm_manage.controller;

import com.dfksoft.hrm_manage.entity.DeviceId;
import com.dfksoft.hrm_manage.entity.Devices;
import com.dfksoft.hrm_manage.service.DevicesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DevicesController {
    private final DevicesService devicesService;

    public DevicesController(DevicesService devicesService) {
        this.devicesService = devicesService;
    }

    @RequestMapping("/devices")
    public String index(Model model) {
        List<Devices> devices = devicesService.getAllDevices();

        model.addAttribute("devices", devices);

        return "devices";
    }

    @RequestMapping("/addNewDevice")
    public String addNewDevice(@RequestParam("name") String name, @RequestParam("macAddress") String macAddress,
                               @RequestParam("address") String address, Model model) {
        Devices devices = new Devices();
        DeviceId deviceId = new DeviceId();

        deviceId.setMacDevice(macAddress);
        deviceId.setName(name);

        devices.setAddress(address);
        devices.setId(deviceId);

        devicesService.saveDevices(devices);


        return "devices";
    }

}
