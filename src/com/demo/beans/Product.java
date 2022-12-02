package com.demo.beans;

public class Product 
{
private int id;
private String name;
private int Qty;
private float Price;

public Product(int id) 
{
	super();
	this.id = id;
	this.name = null;
	this.Qty = 0;
	this.Price = 0;
}



public Product(int id, String name, int qty, float price) 
{
	super();
	this.id = id;
	this.name = name;
	this.Qty = qty;
	this.Price = price;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getQty() {
	return Qty;
}


public void setQty(int qty) {
	Qty = qty;
}


public float getPrice() {
	return Price;
}


public void setPrice(float price) {
	Price = price;
}

public String toString() {
	return "Product id=" + id + ", name=" + name + ", Qty=" + Qty + ", Price=" + Price;
}


}
