package com.codegym.managerprocesssale.repository;

import com.codegym.managerprocesssale.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
