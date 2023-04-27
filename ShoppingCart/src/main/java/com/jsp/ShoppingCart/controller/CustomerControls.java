package com.jsp.ShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ShoppingCart.dao.CartOperations;
import com.jsp.ShoppingCart.dao.CustomerOperations;
import com.jsp.ShoppingCart.dao.ProductsOperations;
import com.jsp.ShoppingCart.dto.Customer;
import com.jsp.ShoppingCart.dto.Products;

@RestController
public class CustomerControls {
	@Autowired
	CustomerOperations customerOperations;
	@Autowired
	ProductsOperations productsOperations;
	@Autowired
	CartOperations cartOperations;

	@PostMapping("/customer/login")
	public List<Products> insert(@RequestBody Customer customer) {
		customerOperations.insert(customer);
		cartOperations.invokeCart(customer);
		customerOperations.createCart(customer);
		return productsOperations.fetchAllProducts();
	}

	@GetMapping("/customer/availableproducts")
	public List<Products> productsAvailable() {
		return productsOperations.fetchAllProducts();
	}

	@PostMapping("/customer/buyproducts/{customerId}")
	public void addprodtoCart(@PathVariable int customerId, @RequestBody Products products) {
//		System.out.println(customerId);
//		System.out.println(products);
		cartOperations.productsToCart(customerId, products);
	}

}
