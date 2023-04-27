package com.jsp.ShoppingCart.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.ShoppingCart.dto.Merchant;
import com.jsp.ShoppingCart.dto.Products;
import com.jsp.ShoppingCart.repository.MerchantRepository;

@Component
public class MerchantOperations {
	@Autowired
	MerchantRepository merchantRepository;

	public void merchantdata(Merchant merchant) {
		merchantRepository.save(merchant);
	}

}
