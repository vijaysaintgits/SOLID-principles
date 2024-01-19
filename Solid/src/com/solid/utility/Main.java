package com.solid.utility;

import com.solid.entity.Hotel;
import com.solid.entity.Restaurant;

import com.solid.services.BookingSystem;


public class Main {

	public static void main(String[] args) {
		
		Hotel hotel = new Hotel("001","2 star", "Taj", "Kochi");
        Restaurant restaurant = new Restaurant("002","Chinese","Kanthari","Trivandrum");
       

        
        BookingSystem bookingSystem = new BookingSystem();

        // Example bookings
        bookingSystem.makeBooking(hotel,101); // Book room in the hotel
        bookingSystem.makeBooking(restaurant,5); // Reserve table in the restaurant
        hotel.bookConferenceHall();											
	}

}
