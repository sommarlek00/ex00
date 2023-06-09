package com.demo.domain;

// 시나리오 : 상품테이블의 구조를 내용으로 한 클래스. VO클래스 (Value Object) 
public class ProductVO {

	// VO클래스의 필드는 접근자를 private를 사용해야함
	private String name;
	private double price;
	
	public ProductVO(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// getter, setter는 public
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductVO [name=" + name + ", price=" + price + "]";
	}
	
	
}
