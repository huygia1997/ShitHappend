package com.dfksoft.hrm_manage.repository;

import com.dfksoft.hrm_manage.entity.Devices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevicesRepository extends JpaRepository<Devices, Long> {
    void deleteById(Long id);
    Devices findDevicesById(Long id);

}
