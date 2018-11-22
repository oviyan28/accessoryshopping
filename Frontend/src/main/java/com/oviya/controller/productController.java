package com.oviya.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oviya.Dao.ProductDao;
import com.oviya.models.Product;

@Controller
public class productController {
@Autowired

	private ProductDao productDao;
public productController() {
	System.out.println("ProductController Bean is created");
	}

//url to request this method is http://localhost:8080/frontend/all/getallproducts
@RequestMapping(value="/all/getAllProducts")
public String getAllProducts(Model model) {
	List<Product> products=productDao.getAllProducts(); //get the data from Dao
	model.addAttribute("products",products);  //to send the data toJSP (UI) page use Model
    return "listofproducts"; 
}
@RequestMapping(value="/all/getProduct")
public String getProduct(@RequestParam int id,Model model){
	Product product=productDao.getProduct(id);//get product object from the Dao
	  model.addAttribute("productAttr",product);//send the data to the jsp page
	  return "viewproduct";
}

@RequestMapping(value="/admin/deleteProduct")
public String deleteProduct(@RequestParam int id){
	productDao.deleteProduct(id);
	return "redirect:/all/getallproducts";
	
}

@RequestMapping(value="/admin/getProductForm")//to get productform.jsp 
public String getProductForm(Model model){
	Product p=new Product();
	model.addAttribute("product",p);//p is newly created product object which has default values
	return "productform";//send a new product object to productform.jsp
}
@RequestMapping(value="/admin/addProduct")//form in productform.jsp is submitted
public String addProduct(@Valid @ModelAttribute Product product,BindingResult result){	
	if(result.hasErrors()){//after validation if any errors
		return "productform";
	}
	
	productDao.addProduct(product);//in dao session.save(product)
	
	return "redirect:/all/getallproducts";
}
@RequestMapping(value="/admin/getUpdateProductForm")
public String getUpdateProductForm(@RequestParam int id,Model model){
	Product product=productDao.getProduct(id);
	model.addAttribute("product",product);
	return "updateform";
}
@RequestMapping(value="/admin/UpdateProduct")
public String updateProduct(@Valid @ModelAttribute Product product,BindingResult result){
	if(result.hasErrors()){
		return "updateform";
	}
	productDao.updateProduct(product);
	return "redirect:/all/getAllProducts";
}
}

