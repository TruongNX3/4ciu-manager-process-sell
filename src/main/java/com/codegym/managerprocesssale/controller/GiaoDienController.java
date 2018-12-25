package com.codegym.managerprocesssale.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GiaoDienController {
    @GetMapping("index")
    public ModelAndView index() {
        return new ModelAndView("giaodien/index");
    }

    @GetMapping("checkout")
    public ModelAndView checkOutCart() {
        return new ModelAndView("giaodien/checkout");
    }
}
