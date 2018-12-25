package com.codegym.managerprocesssale.repository;

import com.codegym.managerprocesssale.model.ImageProduct;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface ImageProductRepository extends PagingAndSortingRepository<ImageProduct, Integer> {
    ImageProduct findImageProductByProductId(Integer id);
    Iterable<ImageProduct> findImageProductsByAvatar(Integer avatar);
    void deleteByProductId(Integer integer);
}
