package com.codegym.managerprocesssale;

import com.codegym.managerprocesssale.service.ProductService;
import com.codegym.managerprocesssale.service.UserService;
import com.codegym.managerprocesssale.service.impl.ProductServiceImpl;
import com.codegym.managerprocesssale.service.impl.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagerProcessSaleApplication {
	@Bean
	public ProductService productService() {
		return new ProductServiceImpl();
	}

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(ManagerProcessSaleApplication.class, args);
	}

}

