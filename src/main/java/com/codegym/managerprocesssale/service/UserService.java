package com.codegym.managerprocesssale.service;

import com.codegym.managerprocesssale.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<User> findAll(Pageable pageable);

    void save(User user);
}
