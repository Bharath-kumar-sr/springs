package com.jsp.ShoppingCart.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Merchant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int merchantId;
	private String merchantCompany;
	private String merchantMail;

	public int getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantCompany() {
		return merchantCompany;
	}

	public void setMerchantCompany(String merchantCompany) {
		this.merchantCompany = merchantCompany;
	}

	public String getMerchantMail() {
		return merchantMail;
	}

	public void setMerchantMail(String merchantMail) {
		this.merchantMail = merchantMail;
	}

	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", merchantCompany=" + merchantCompany + ", merchantMail="
				+ merchantMail + "]";
	}

}
