package org.example.greeting;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.greeting.models.BaseProduct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class GreetingApplication {

	private static final Logger LOGGER = LogManager.getLogger(GreetingApplication.class);
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(GreetingApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		 
		BaseProduct product = context.getBean(BaseProduct.class);
		 
		product.setPrice(10.21F);
		 
		LOGGER.info(product.getPrice());
		product.applyDiscount();
		LOGGER.info(product.getPrice());
		 
		 
	}
}
