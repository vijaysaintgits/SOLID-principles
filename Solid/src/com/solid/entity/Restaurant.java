package com.solid.entity;

import com.solid.interfaces.Bookable;

public class Restaurant extends Hospitality implements Bookable  {
	
	String restId;
	String restType;

	 

	public Restaurant(String restId, String restType,String name,String place) {
		super();
		this.restId = restId;
		this.restType = restType;
		this.name = name;
		this.place = place;
	}



	@Override
	public void book(int identifier) {
		
		System.out.println("Table " + identifier + " reserved in the restaurant.");
		System.out.println("Restaurant type is " + this.restType);
		System.out.println("Restaurant name is " + this.name);
		System.out.println("Restaurant place is " + this.place);
		
	
		
	}

}
