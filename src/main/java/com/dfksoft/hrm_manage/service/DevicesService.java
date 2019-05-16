package com.dfksoft.hrm_manage.service;

import com.dfksoft.hrm_manage.entity.Devices;
import com.dfksoft.hrm_manage.repository.DevicesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevicesService {
   private final DevicesRepository devicesRepository;


    public DevicesService(DevicesRepository devicesRepository) {
        this.devicesRepository = devicesRepository;
    }
    public List<Devices> getAllDevices() {
        return (List<Devices>)devicesRepository.findAll();
    }

    public void saveDevices(Devices user) {
        devicesRepository.save(user);
    }

    public void deleteDevices(Long id) {
        devicesRepository.deleteById(id);
    }

    public Devices findDevicesById(Long id) {
        return devicesRepository.findDevicesById(id);
    }


}
