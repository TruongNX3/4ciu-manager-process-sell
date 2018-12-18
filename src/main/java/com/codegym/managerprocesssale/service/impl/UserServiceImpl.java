package com.codegym.managerprocesssale.service.impl;

import com.codegym.managerprocesssale.model.User;
import com.codegym.managerprocesssale.repository.UserRepository;
import com.codegym.managerprocesssale.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
