package com.codegym.managerprocesssale.service.impl;

import com.codegym.managerprocesssale.model.ImageProduct;
import com.codegym.managerprocesssale.repository.ImageProductRepository;
import com.codegym.managerprocesssale.service.ImageProductService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class ImageProductServiceImpl implements ImageProductService {
    @Autowired
    private ImageProductRepository imageProductRepository;

    @Override
    public void save(ImageProduct imageProduct) {
        imageProductRepository.save(imageProduct);
    }

    @Override
    public void remove(Integer id) {
        imageProductRepository.deleteById(id);
    }

    @Override
    public void deleteByProductId(Integer id) {
        imageProductRepository.deleteByProductId(id);
    }

    @Override
    public ImageProduct findImageProductByProductId(Integer id) {
        return imageProductRepository.findImageProductByProductId(id);
    }

    @Override
    public Iterable<ImageProduct> findAllByAvatar(Integer avatar) {
        return imageProductRepository.findImageProductsByAvatar(avatar);
    }

//    @Override
//    public ImageProduct findAllByAvafindAllByAvatarAndProductId(Integer avatar, Integer id) {
//        return imageProductRepository.findImageProductsByAvatarAndProductId(avatar,id);
//    }


}
