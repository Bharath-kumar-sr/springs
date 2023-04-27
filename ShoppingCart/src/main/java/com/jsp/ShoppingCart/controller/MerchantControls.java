package com.jsp.ShoppingCart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.ShoppingCart.dao.MerchantOperations;
import com.jsp.ShoppingCart.dao.ProductsOperations;
import com.jsp.ShoppingCart.dto.Merchant;
import com.jsp.ShoppingCart.dto.Products;

@RestController
public class MerchantControls {
	@Autowired
	MerchantOperations merchantOperations;
	@Autowired
	ProductsOperations productsOperations;

	@PostMapping("/merchant/login")
	public void login(@RequestBody Merchant merchant) {
		merchantOperations.merchantdata(merchant);
	}

	@PostMapping("/merchant/addproducts/{merchantId}")
	public void insert(@PathVariable int merchantId, @RequestBody Products products) {
		productsOperations.insertproducts(merchantId, products);
	}

	@DeleteMapping("/merchant/deleteproducts")
	public void delete(@RequestBody Products products) {
		productsOperations.deleteproducts(products);
	}

	@PutMapping("/merchant/updateproducts")
	public void update(@RequestBody Products products) {
		productsOperations.updateproducts(products);
	}

	@GetMapping("/merchant/findproducts")
	public List<Products> fetchall(@RequestBody Merchant merchant) {
		List<Products> products=productsOperations.merchantProducts(merchant);
		return products;
	}
}
