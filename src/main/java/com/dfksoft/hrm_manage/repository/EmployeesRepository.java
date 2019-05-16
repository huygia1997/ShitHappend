package com.dfksoft.hrm_manage.repository;

import com.dfksoft.hrm_manage.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {

    void deleteById(Long id);
    Employees findById(long id);

}
