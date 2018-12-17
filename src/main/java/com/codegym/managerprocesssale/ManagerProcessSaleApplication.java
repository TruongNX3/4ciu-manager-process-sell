package com.codegym.managerprocesssale;

import com.codegym.managerprocesssale.service.ProductService;
import com.codegym.managerprocesssale.service.impl.ProductServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagerProcessSaleApplication {
	@Bean
	public ProductService productService() {
		return new ProductServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(ManagerProcessSaleApplication.class, args);
	}

}

