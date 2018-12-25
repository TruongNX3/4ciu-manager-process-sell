package com.codegym.managerprocesssale.repository;


import com.codegym.managerprocesssale.model.ProductType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface ProductTypeRepository extends PagingAndSortingRepository<ProductType, Long> {
    Page<ProductType> findByNameContaining(String s, Pageable pageable);
}
