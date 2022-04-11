package com.navneet.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.navneet.core.service.PaymentServiceImpl;


@SpringBootTest
class CoreApplicationTests {
	
//	@Autowired
//	PaymentService service;
	
	@Autowired
	PaymentServiceImpl service;

	@Test
	void contextLoads() {
	}

	@Test
	void testDependencyInjection() {
		assertNotNull(service.getDao());
	}
}
