package com.jsp.ShoppingCart.dto;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.annotations.ManyToAny;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Component
@Entity
public class Cart {
	@Id
	private int cartId;
	private String cartName;
	@OneToMany
	List<Products> products;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getCartName() {
		return cartName;
	}

	public void setCartName(String cartName) {
		this.cartName = cartName;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartName=" + cartName + ", products=" + products + "]";
	}

}
