package com.demo.Service;

import java.util.Scanner;

import com.demo.beans.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService
{
	static List<Product> plist;

	static{
		plist=new ArrayList<>();	
		plist.add(new Product(1,"Laptop",2,80946));
		plist.add(new Product(2,"Table",2,2800));
	}
	public void addnewproduct() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter product id");
		int pid=sc.nextInt();
		System.out.println("eneter product name");
		String nm=sc.nextLine();
		sc.next();
		System.out.println("eneter product Qty");
		int QTy=sc.nextInt();
		System.out.println("eneter product price");
		float price=sc.nextFloat();

		Product p=new Product(pid,nm,QTy,price);
		plist.add(p);	       
	}
	public List<Product> displayallproducts() 
	{
		if(plist.size()>0)
		{
			return plist;
		}
		return null;
	}
	public Product findByID(int id)
	{
		for(Product P:plist)
		{
			if(P.getId()==(id)) 

				return P;

		}return null;


	}

	public Product FindByName(String nm) 
	{
		for(Product P:plist)
		{
			if(P.getName().equals(nm)) 

				return P;

		}return null;
	}

	public boolean RemoveByID(int id) 
	{

		return plist.remove(findByID(id));

	}
	
public boolean  RemoveByName(String nm) 
	{
		Product p=FindByName(nm);
		
		if(p!=null)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println(p);
			System.out.println("do you want to delete it(y/n)?");
			String ans=sc.next();
			if(ans.equals("y")) 
			{
				plist.remove(p);
				return true;
			}
			else 
			{
				return false;
			}

		}
		return false;
	}
}