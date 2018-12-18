package com.codegym.managerprocesssale.controller;

import com.codegym.managerprocesssale.model.User;
import com.codegym.managerprocesssale.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/create-user")
    public ModelAndView formCreateUser() {
        ModelAndView modelAndView = new ModelAndView("/user/create");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/create-user")
    public ModelAndView createUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()){
            ModelAndView modelAndView = new ModelAndView("/user/create");
            return modelAndView;
        } else {
            userService.save(user);
            ModelAndView modelAndView = new ModelAndView("/user/create");
            modelAndView.addObject("user", user);
            modelAndView.addObject("message", "Thành Công");
            return modelAndView;
        }

    }

    @GetMapping("/users")
    public ModelAndView listUser(@PageableDefault(size = 10) Pageable pageable) {
        Page<User> users;
            users = userService.findAll(pageable);
        ModelAndView modelAndView = new ModelAndView("/user/index");
        modelAndView.addObject("users", users);
        return modelAndView;

    }

}
