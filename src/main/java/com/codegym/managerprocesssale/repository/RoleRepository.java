package com.codegym.managerprocesssale.repository;

import com.codegym.managerprocesssale.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
    Role findByRole(String role);
}
