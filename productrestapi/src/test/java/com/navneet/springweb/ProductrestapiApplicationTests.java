package com.navneet.springweb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.navneet.springweb.model.Product;

@SpringBootTest
class ProductrestapiApplicationTests {

	@Value("${productrestapi.services.url}")
	private String baseUrl;
	
	@Test
	void getProductTest() {
		System.out.println(baseUrl);
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseUrl+"1", Product.class);
		assertNotNull(product);
		assertEquals("IPhone", product.getName());
	}
	
	@Test
	void saveProductTest() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("Samsung");
		product.setPrice(1700);
		product.setDescription("Another excellent product");
		Product newProduct = restTemplate.postForObject(baseUrl, product, Product.class);
		
		assertNotNull(newProduct);
		assertNotNull(newProduct.getId());
		assertEquals("Samsung", newProduct.getName());
	}	
	
	@Test
	void updateProductTest() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseUrl+"1", Product.class);
		product.setPrice(1900);
		
		restTemplate.put(baseUrl, product);
	}

}


















