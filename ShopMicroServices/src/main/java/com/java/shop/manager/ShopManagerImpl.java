package com.java.shop.manager;

import org.springframework.stereotype.Component;

import com.java.shop.Shop;
import com.java.shop.utils.ShopUtils;

@Component
public class ShopManagerImpl implements ShopManager{

	@Override
	public Shop addShop(Shop shop) throws Exception {
	    String latLongs[] = ShopUtils.getLatLongPositions(shop.getAddress());
		shop.setLatitude(latLongs[0]);
		shop.setLongitude(latLongs[1]);		
		return shop;
	}

	@Override
	public Shop getShop(Integer lati, Integer longi) {
		Shop sh=new Shop();
		sh.setShopName("Nariman House");
		sh.setAddress("Nariman, Mumbai");
		sh.setLatitude(lati.toString());
		sh.setLongitude(longi.toString());
		return sh;
	}

}
