package org.example.greeting.services;

public class BasicDiscountStrategy implements DiscountStrategy {

	@Override
	public float applyDiscount(float price) {		
		return (float) (price * 0.5);
	}

}
