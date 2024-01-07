package com.vinay.spring.mvc;

import java.util.HashMap;
import java.util.Map;

public class Phone {
	private String pBrand;
	private String pModel;
	private String pPrice;
	private String pQuantity;
	private String pTotalPrice;
	private static final Map<String, Integer> MODEL_PRICES;

	static {
		MODEL_PRICES = new HashMap<>();
		MODEL_PRICES.put("XR", 800); 
		MODEL_PRICES.put("Pro", 900); 
		MODEL_PRICES.put("ProMax", 1000); 
		MODEL_PRICES.put("Galaxy 20 Plus", 700); 
		MODEL_PRICES.put("Galaxy S20", 1100); 
	}

	public double getPriceForModel(String model) {
		return MODEL_PRICES.getOrDefault(model, 0);
	}
	public String getpBrand() {
		return pBrand;
	}
	public void setpBrand(String pBrand) {
		this.pBrand = pBrand;
	}
	public String getpModel() {
		return pModel;
	}
	public void setpModel(String pModel) {
		this.pModel = pModel;
	}
	public String getpPrice() {
		return pPrice;
	}
	public void setpPrice(String pPrice) {
		this.pPrice = pPrice;
	}
	public String getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(String pQuantity) {
		this.pQuantity = pQuantity;
	}
	public String getpTotalPrice() {
		return pTotalPrice;
	}
	public void setpTotalPrice(String pTotalPrice) {
		this.pTotalPrice = pTotalPrice;
	}
	@Override
	public String toString() {
		return "Phone [pBrand=" + pBrand + ", pModel=" + pModel + ", pPrice=" + pPrice + ", pQuantity=" + pQuantity
				+ ", pTotalPrice=" + pTotalPrice + "]";
	}
	

}
