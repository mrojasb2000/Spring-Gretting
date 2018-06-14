package org.example.greeting.models;

import org.example.greeting.services.DiscountStrategy;

public class BasicProduct implements BaseProduct {

	DiscountStrategy discountStrategy;
	float price;
	
	
	public BasicProduct(){}
	
	public BasicProduct(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	@Override
	public void applyDiscount() {
		this.price = discountStrategy.applyDiscount(price);
	}

	@Override
	public float getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(float price) {
		this.price = price;		
	}

}
