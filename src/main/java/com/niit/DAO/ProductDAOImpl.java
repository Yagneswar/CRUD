package com.niit.DAO;

import java.util.ArrayList;
import java.util.List;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;


@Transactional

public class ProductDAOImpl implements ProductDAO{

		
		@Autowired
		private SessionFactory sessionFactory;
		

		@Override
		
		public List<Product> getAll() {				
			return sessionFactory.getCurrentSession().createQuery("FROM Product").list();
		}

		@Override
	
		public void insert(Product p) {
			sessionFactory.getCurrentSession().persist(p);
			
		}

		@Override
		
		public void update(Product p) {
			
			sessionFactory.getCurrentSession().update(p);
			
		}

		@Override
		
		public void delete(int id) {
		
			 sessionFactory.getCurrentSession().delete(getProduct(id));
		}

		
		@Override
		
		public Product getProduct(int id) {
			return sessionFactory.getCurrentSession().get(Product.class, id);
		}

}