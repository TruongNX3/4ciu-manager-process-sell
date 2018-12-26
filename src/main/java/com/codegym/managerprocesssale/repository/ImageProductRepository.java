package com.codegym.managerprocesssale.repository;

import com.codegym.managerprocesssale.model.ImageProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ImageProductRepository extends PagingAndSortingRepository<ImageProduct, Integer> {
    ImageProduct findImageProductByProductId(Integer id);
    Page<ImageProduct> findImageProductsByAvatar(Pageable pageable,Integer integer);
    void deleteByProductId(Integer integer);
}
