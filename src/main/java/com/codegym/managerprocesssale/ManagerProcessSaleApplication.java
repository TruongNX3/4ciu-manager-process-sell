package com.codegym.managerprocesssale;

<<<<<<< Updated upstream
import com.codegym.managerprocesssale.service.ImageProductService;
import com.codegym.managerprocesssale.service.ProducerService;
import com.codegym.managerprocesssale.service.ProductService;
import com.codegym.managerprocesssale.service.ProductTypeService;
import com.codegym.managerprocesssale.service.impl.ImageProductServiceImpl;
import com.codegym.managerprocesssale.service.impl.ProducerServiceImpl;
import com.codegym.managerprocesssale.service.impl.ProductServiceImpl;
import com.codegym.managerprocesssale.service.impl.ProductTypeServiceImpl;
=======
import com.codegym.managerprocesssale.service.*;
import com.codegym.managerprocesssale.service.impl.*;
>>>>>>> Stashed changes
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagerProcessSaleApplication {
<<<<<<< Updated upstream
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
=======
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

    @Bean
    public OrderDetailsService orderDetailsService() {
        return new OrderDetailsImpl();
    }

    public static void main(String[] args) {
        SpringApplication.run(ManagerProcessSaleApplication.class, args);
    }
>>>>>>> Stashed changes

}

