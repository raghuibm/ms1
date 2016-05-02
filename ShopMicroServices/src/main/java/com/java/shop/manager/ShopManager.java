package com.java.shop.manager;

import org.springframework.stereotype.Component;

import com.java.shop.Shop;
@Component
public interface ShopManager {
	
	/*
	 * Adds new shop. Calls Google Map API to calculate latitude and longitude and stores in shop object
	 */
	Shop addShop(Shop shop) throws Exception;
	
	/*
	 * Gets nearest shop based on latitude and longitude
	 */
	Shop getShop(Integer lati, Integer longi );

}
