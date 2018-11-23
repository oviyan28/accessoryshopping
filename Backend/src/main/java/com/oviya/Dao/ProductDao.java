package com.oviya.Dao;

import java.util.List;
import java.util.Locale.Category;

import com.oviya.models.Product;

public interface ProductDao{
Product addProduct(Product product);//product.id=0, new Object, insert
Product getProduct(int id);

//updated product details
void updateProduct(Product product);//product.id= ,already existing obj, update
void deleteProduct(int id);
List<Product> getAllProducts();//fetch all the records from product table
List<Category> getAllCategories();
}


 
