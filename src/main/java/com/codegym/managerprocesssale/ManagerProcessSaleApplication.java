package com.codegym.managerprocesssale;

import com.codegym.managerprocesssale.service.ImageProductService;
import com.codegym.managerprocesssale.service.ProducerService;
import com.codegym.managerprocesssale.service.ProductService;
import com.codegym.managerprocesssale.service.ProductTypeService;
import com.codegym.managerprocesssale.service.impl.ImageProductServiceImpl;
import com.codegym.managerprocesssale.service.impl.ProducerServiceImpl;
import com.codegym.managerprocesssale.service.impl.ProductServiceImpl;
import com.codegym.managerprocesssale.service.impl.ProductTypeServiceImpl;
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
	public ProducerService producerService() {
		return new ProducerServiceImpl();
	}

	@Bean
	public ProductTypeService productTypeService() {
		return new ProductTypeServiceImpl();
	}

	@Bean
	public ImageProductService imageProductService() {
		return new ImageProductServiceImpl();
	}

	public static void main(String[] args) {
		SpringApplication.run(ManagerProcessSaleApplication.class, args);
	}

}

