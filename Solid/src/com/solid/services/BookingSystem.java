package com.solid.services;

import com.solid.interfaces.Bookable;

public class BookingSystem {	 

	    public void makeBooking(Bookable place,int identifier) {
	    	place.book(identifier);
	    }

}
