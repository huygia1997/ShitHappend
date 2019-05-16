package com.dfksoft.hrm_manage.service;

import com.dfksoft.hrm_manage.entity.Employees;
import com.dfksoft.hrm_manage.repository.EmployeesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    private final  EmployeesRepository employeesRepository;

    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public List<Employees> getAllEmployees() {
        return (List<Employees>) employeesRepository.findAll();
    }
    public void saveEmployee(Employees employees) {
        employeesRepository.save(employees);
    }
    public void deleteEmployee(Long id) {
        employeesRepository.deleteById(id);
    }
    public Employees findEmployeeById(long id) {
        return employeesRepository.findById(id);
    }
}
