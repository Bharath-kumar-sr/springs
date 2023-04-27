package com.jsp.ShoppingCart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.jsp.ShoppingCart.dto.Merchant;
@Component
public interface MerchantRepository  extends JpaRepository<Merchant, Integer>{

}
