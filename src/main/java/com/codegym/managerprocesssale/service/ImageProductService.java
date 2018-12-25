package com.codegym.managerprocesssale.service;



import com.codegym.managerprocesssale.model.ImageProduct;

import java.util.List;

public interface ImageProductService {
    void save(ImageProduct imageProduct);

    void remove(Integer id);

    void deleteByProductId(Integer id);

    ImageProduct findImageProductByProductId(Integer id);

    Iterable<ImageProduct> findAllByAvatar(Integer avatar);
}
