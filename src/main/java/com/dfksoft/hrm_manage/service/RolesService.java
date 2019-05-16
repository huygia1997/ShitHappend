package com.dfksoft.hrm_manage.service;

import com.dfksoft.hrm_manage.entity.Roles;
import com.dfksoft.hrm_manage.repository.RolesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesService {
    private final RolesRepository rolesRepository;

    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public List<Roles> getAllRoles() {
        return (List<Roles>) rolesRepository.findAll();
    }

    public void saveRoles(Roles roles) {
        rolesRepository.save(roles);
    }

    public void deleteRoles(int id) {
        rolesRepository.deleteById(id);
    }

    public Roles findById(int id) {
        return rolesRepository.findById(id);
    }
}
