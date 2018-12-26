package com.codegym.managerprocesssale.service;



import com.codegym.managerprocesssale.model.ImageProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface ImageProductService {
    void save(ImageProduct imageProduct);

    void remove(Integer id);

    void deleteByProductId(Integer id);

    ImageProduct findImageProductByProductId(Integer id);

    Page<ImageProduct> findAllByAvatar(Pageable pageable, Integer integer);
}
