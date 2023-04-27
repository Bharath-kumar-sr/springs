package com.jsp.ShoppingCart.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.ShoppingCart.dto.Merchant;
import com.jsp.ShoppingCart.dto.Products;
import com.jsp.ShoppingCart.repository.MerchantRepository;
import com.jsp.ShoppingCart.repository.ProductsRepository;

@Component
public class ProductsOperations {
	@Autowired
	ProductsRepository productsRepository;
	@Autowired
	MerchantRepository merchantRepository;

	public void insertproducts(int merchantId, Products products) {
		productsRepository.save(products);
		Products update = productsRepository.findById(products.getProductsId()).get();
		update.setMerchant(merchantRepository.findById(merchantId).get());
		productsRepository.save(update);
	}

	public void deleteproducts(Products products) {
		productsRepository.delete(products);
	}

	public void updateproducts(Products products) {
		Products toupdate = productsRepository.findById(products.getProductsId()).get();
		toupdate.setProductsName(products.getProductsName());
		productsRepository.save(toupdate);
	}

	public List<Products> merchantProducts(Merchant merchant) {
		List<Products> find = productsRepository.findAll();
		List<Products> list = new ArrayList<Products>();
		for (int i = 0; i < find.size(); i++) {
			Products search = find.get(i);
			if (merchant.getMerchantId() == search.getMerchant().getMerchantId()) {
				list.add(search);
			}
		}
		return list;
	}

	public List<Products> fetchAllProducts() {
		return productsRepository.findAll();
	}

}
