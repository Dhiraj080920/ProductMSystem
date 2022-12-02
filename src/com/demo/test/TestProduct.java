package com.demo.test;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.demo.Service.ProductService;
import com.demo.Service.ProductServiceImpl;
import com.demo.beans.Product;

public class TestProduct {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ProductService Pservice=new ProductServiceImpl();		
		int choice=0;
		do{
			System.out.println("1.Add new product \n2.remove by id \n3.remove by name "
					+ "\n4.display all products \n5.find by id "
					+ "\n6.display all with Qty \n7.modify price "
					+ "\n8.find by name \n9.sort by price \n10.exit");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch (choice)
		{
			case 1:Pservice.addnewproduct();
			break;
			case 2:
			System.out.println("enter id to remove");
			int id=sc.nextInt();
			boolean status=Pservice.RemoveByID(id);
			if(status)
			{
				System.out.println("removed successfully ");
			}
			else 
			{
				System.out.println("id not found to remove");
			}
			break;
			case 3:System.out.println("enter name to search ");
			String nm=sc.next();
			if
				break;
			case 4:List<Product> plist=Pservice.displayallproducts();
			Iterator <Product> it=plist.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			break;
			case 5:System.out.println("enter product id to search");
			id=sc.nextInt();
			Product  p=Pservice.findByID(id);
			if (p!=null)
			{
				System.out.println("found");
				System.out.println(p);
			}
			else 
			{
				System.out.println("not found");
			}
			case 6://display all with Qty.
				break;
			case 7:
				break;
			case 8:
				System.out.println("enter product name to search");
			String name=sc.next();
			Product p1=Pservice.FIndByName(name);
			if(p1!=null)
			{
				System.out.println("found");
				System.out.println(p1);
			}
			else
			{
				System.out.println("not found");
			}
				
				break;
				
				
			case 9:
				break;
		}
	
		}while(choice!=10);
	}
}
