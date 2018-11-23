package com.oviya.Backend;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.oviya.Dao.ProductDao;
import com.oviya.Dao.ProductDaoImpl;
import com.oviya.models.Product;
import com.oviya.Configuration.DBConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class); 
      ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
      
   /* FETCHING RECORD FROM THE TABLE FOR PARTCULAR ID
      ---------------------------------------------------
      Product product=productDao.getProduct(4);
      if(product!=null) {
              System.out.println(product.getProductName());
      }
      else {
    	  System.out.println("Product Details not found");
      }
   */
      
   /*     ADDING NEW PRODUCT
        -------------------------------
      Product product=new Product(); //New Product
      product.setProductDesc("DIGITAL MULTIFUNCTIONAL"); //inserted in the column productname
      product.setProductName("CASIO"); //column productdesc
      product.setPrice(1000); //column price
      product.setQuantity(10); //column quantity
     //column id =0
      productDao.addProduct(product);//to insert product details into a product table
  */
   /*   DELETE RECORD FROM THE TABLE
       -------------------------------------
       productDao.deleteProduct(36); 
   */  
   /*  GET ALL PRODUCTS
      --------------------
        List<Product>  products = productDao.getAllProducts();
      	for(Product p:products) {
    	System.out.println(p.getId() + " " + p.getProductDesc() + " " + p.getProductName() + " " + p.getPrice() + " " + p.getQuantity());  
      }
    */
    }
}
