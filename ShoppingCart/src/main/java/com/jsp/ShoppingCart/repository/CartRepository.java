package com.jsp.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jsp.ShoppingCart.dto.Cart;

@Component
public interface CartRepository extends JpaRepository<Cart, Integer> {
//	public Cart insert(int customerId);

}
