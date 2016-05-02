package com.java.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.shop.Shop;
import com.java.shop.manager.ShopManager;

@RestController
public class ShopRootController {

	@Autowired
	private ShopManager shopManager;

	@RequestMapping(value="/addShop", method=RequestMethod.POST)
	@ResponseBody
	public String addShop(@RequestBody Shop shop) throws Exception{
		shopManager.addShop(shop);
		System.out.println("Latitude: "+shop.getLatitude()+" and Longitude: "+shop.getLongitude());
		return "Sucessfully added new shop. Latitude: "+shop.getLatitude()+" and Longitude: "+shop.getLongitude();
	} 

	@RequestMapping(value="/getShop/{lati}/{longi}", method=RequestMethod.GET)
	public ResponseEntity<Shop> getShop(@PathVariable("lati") Integer lati,@PathVariable("longi") Integer longi){
		Shop sh=shopManager.getShop(lati, longi);
		return new ResponseEntity<Shop>(sh,HttpStatus.OK);

	}

}
