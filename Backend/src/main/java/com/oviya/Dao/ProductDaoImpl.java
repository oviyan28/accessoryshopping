package com.oviya.Dao;

import java.util.List;
import java.util.Locale.Category;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.oviya.models.Product;
@Repository
@Transactional

public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;	
	public ProductDaoImpl(){
		System.out.println("ProductDaoImpl bean is created");
	}

	public Product addProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		session.save(product);
			return product;
			}

	public Product getProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product product=(Product)session.get(Product.class, id);
		// TODO Auto-generated method stub
		return product;
	}

	public void updateProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		session.update(product);//update product set productname=?,productdesc=?,price=?,quantity=? where id=?
		// TODO Auto-generated method stub

	}

	public void deleteProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		//Get product object for the given id
		Product product=(Product)session.get(Product.class, id);
		if(product!=null)
		session.delete(product);//delete from product where id=?
		// TODO Auto-generated method stub

	}

	public List<Product> getAllProducts() {
		Session session=sessionFactory.getCurrentSession();
		//from Product -> HQL
		//Product is class name
		//from Product -> Select * from Product -> records from product table
		//record will get converted into product object
		//product object will get added into a list
		// List<Product>
		Query query=session.createQuery("from Product");//Product is an entity 
		List<Product> products=query.list();
		return products;
		// TODO Auto-generated method stub
	
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Category");
		List<Category> categories=query.list();
		return categories;
	}

}
