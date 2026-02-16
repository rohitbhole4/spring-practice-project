package com.productapp;

import com.productapp.model.Product;
import com.productapp.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProductappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappJdbcApplication.class, args);
	}

    private ProductServiceImpl productService;

    @Autowired
    public void setProductService(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
        Product pr = new Product("mobile","apple","ele",120000);
        productService.addProduct(pr);

        productService.updateProduct(8,79000);

       // productService.deleteProduct(6);

        productService.getAllProducts().forEach(System.out::println);
    }
}
