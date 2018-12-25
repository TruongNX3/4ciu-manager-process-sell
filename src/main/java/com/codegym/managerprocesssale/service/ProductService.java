package com.codegym.managerprocesssale.service;

import com.codegym.managerprocesssale.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Optional;

public interface ProductService {
    Page<Product> findAllByNameContaining(String s, Pageable pageable);

    Page<Product> findAll(Pageable pageable);

    Optional<Product> findById(Integer id);

    void save(Product product);

    void remove(Integer id);


}
