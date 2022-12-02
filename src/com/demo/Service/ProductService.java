package com.demo.Service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService 
{

	void addnewproduct();

	List<Product> displayallproducts();

	Product findByID(int id);

	boolean FIndByName(String nm);

	boolean RemoveByID(int id);

	boolean RemoveByName(String nm);
	
	

	


	
	
}
