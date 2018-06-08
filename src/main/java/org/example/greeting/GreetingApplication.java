package org.example.greeting;

import org.example.greeting.models.BasicProduct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class GreetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingApplication.class, args);
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		 
		 BasicProduct product = (BasicProduct) context.getBean(BasicProduct.class);
		 
		 product.setPrice(10.21F);
		 
		 System.out.println(product.getPrice());
		 product.ApplyDiscount();
		 System.out.println(product.getPrice());
		 
		 
	}
}
