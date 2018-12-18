package com.codegym.managerprocesssale.repository;

import com.codegym.managerprocesssale.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
}
