package com.wf.training.mavenserv.entity;

public class Product {
	private String name;
	private String category;
	private int cost;
	
	public Product(String name, String category, int cost) {
		super();
		this.name = name;
		this.category = category;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
