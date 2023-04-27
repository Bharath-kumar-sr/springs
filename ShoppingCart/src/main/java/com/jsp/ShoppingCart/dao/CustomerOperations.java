package com.jsp.ShoppingCart.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.ShoppingCart.dto.Cart;
import com.jsp.ShoppingCart.dto.Customer;
import com.jsp.ShoppingCart.dto.Products;
import com.jsp.ShoppingCart.repository.CustomerRepository;

@Component
public class CustomerOperations {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	Customer customer;
	@Autowired
	Cart cart;
	List<Products> list = new ArrayList<Products>();

	public void insert(Customer customer) {
		customerRepository.save(customer);
	}

	public void createCart(Customer customer) {
		Customer setcart = customerRepository.findById(customer.getCustomerId()).get();
		setcart.setCart(cart);
		customerRepository.save(customer);
	}

}
