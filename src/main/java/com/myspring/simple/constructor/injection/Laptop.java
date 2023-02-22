package com.myspring.simple.constructor.injection;

public class Laptop {

	private int id;
	private String name;
	private double price;
	
	public Laptop(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void display() {
		System.out.println("id = "+id);
		System.out.println("Name = "+name);
		System.out.println("price = "+price);
	}
	
	@Override
	public String toString() {
		return "id = "+id+"\n name = "+name+"\n Price"+price;
	}
}
