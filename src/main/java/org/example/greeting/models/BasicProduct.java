package org.example.greeting.models;

import org.example.greeting.services.DiscountStrategy;

public class BasicProduct implements BaseProduct {

	DiscountStrategy _discountStrategy;
	float _price;
	
	
	public BasicProduct(){}
	
	public BasicProduct(DiscountStrategy discountStrategy) {
		this._discountStrategy = discountStrategy;
	}
	
	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this._discountStrategy = discountStrategy;
	}
	
	public float getPrice() {
		return this._price;
	}
	
	public void setPrice(float price) {
		this._price = price;
	}

	@Override
	public void ApplyDiscount() {
		this._price = _discountStrategy.ApplyDiscount(_price);
	}

}
