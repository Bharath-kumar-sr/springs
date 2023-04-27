package com.jsp.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jsp.ShoppingCart.dto.Products;

@Component
public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
