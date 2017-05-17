package com.niit.DAO;

import java.util.List;

import com.niit.model.Product;


public interface ProductDAO {

	List<Product> getAll();
	
   public void insert(Product p);
	public void update(Product p);
    public	void delete(int id);
	
   public Product getProduct(int id);
	
	
}
