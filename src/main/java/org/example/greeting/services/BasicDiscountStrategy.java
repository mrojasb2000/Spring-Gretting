package org.example.greeting.services;

public class BasicDiscountStrategy implements DiscountStrategy {

	@Override
	public float ApplyDiscount(float price) {		
		return (float) (price * 0.5);
	}

}
