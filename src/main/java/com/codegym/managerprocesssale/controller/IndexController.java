package com.codegym.managerprocesssale.controller;


import com.codegym.managerprocesssale.model.ImageProduct;
import com.codegym.managerprocesssale.model.Product;
import com.codegym.managerprocesssale.service.ImageProductService;
import com.codegym.managerprocesssale.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {
    @Autowired
    private ProductService productService;

    @Autowired
    private ImageProductService imageProductService;


    @GetMapping("/index")
    public ModelAndView listProduct(@PageableDefault(size = 12) Pageable pageable, @ModelAttribute("s") String s) {
        Page<Product> products;

            if (s == null) {
        products = productService.findAll(pageable);
            } else {
                products = productService.findAllByNameContaining(s, pageable);
            }
//        ArrayList<ImageProduct> imageProducts = new ArrayList<>();
//        for (Product product: products){
//            Integer id = product.getId();
//            imageProducts.add(imageProductService.findAllByAvafindAllByAvatarAndProductId(0, id));


        Page<ImageProduct> imageProducts = imageProductService.findAllByAvatar(pageable, 0);
        ModelAndView modelAndView = new ModelAndView("giaodien/index");
        modelAndView.addObject("products", products);
        modelAndView.addObject("listImages", imageProducts);
        return modelAndView;
    }


}
