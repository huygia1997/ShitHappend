package com.dfksoft.hrm_manage.repository;

import com.dfksoft.hrm_manage.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RolesRepository extends JpaRepository<Roles, Integer> {

    void deleteById(int id);
    Roles findById(int id);
}
