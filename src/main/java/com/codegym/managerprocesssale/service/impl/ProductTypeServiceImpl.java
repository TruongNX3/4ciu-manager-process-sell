package com.codegym.managerprocesssale.service.impl;


import com.codegym.managerprocesssale.model.ProductType;
import com.codegym.managerprocesssale.repository.ProductTypeRepository;
import com.codegym.managerprocesssale.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    private ProductTypeRepository productTypeRepository;


    @Override
    public Page<ProductType> findByNameContaining(String s, Pageable pageable) {
        return productTypeRepository.findByNameContaining(s, pageable);
    }

    @Override
    public Page<ProductType> findAll(Pageable pageable) {
        return productTypeRepository.findAll(pageable);
    }

    @Override
    public Optional<ProductType> findById(Long id) {
        return productTypeRepository.findById(id);
    }

    @Override
    public void save(ProductType productType) {
        productTypeRepository.save(productType);

    }

    @Override
    public void remove(Long id) {
        productTypeRepository.deleteById(id);

    }
}
