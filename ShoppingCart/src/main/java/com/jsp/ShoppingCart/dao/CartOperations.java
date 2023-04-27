package com.jsp.ShoppingCart.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.ShoppingCart.dto.Cart;
import com.jsp.ShoppingCart.dto.Customer;
import com.jsp.ShoppingCart.dto.Products;
import com.jsp.ShoppingCart.repository.CartRepository;

@Component
public class CartOperations {
	@Autowired
	CartRepository cartRepository;
	@Autowired
	Cart cart;
	List<Products> list = new ArrayList<Products>();

	public void invokeCart(Customer customer) {
		cart.setCartId(customer.getCustomerId());
		cart.setCartName(customer.getCustomerName());
		cartRepository.save(cart);
	}

	public void productsToCart(int customerId, Products products) {
		Cart cr = cartRepository.findById(customerId).get();
		list.add(products);
		cr.setProducts(list);
		cartRepository.save(cr);
	}

}
