package com.blz.hotelreservation;

import java.util.ArrayList;

public class HotelReservation {

	ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
	Hotel hotel;

	/*
	 * @purpose: Ability to add hotel adds values using setters method
	 */
	public void addHotel(String hotelName, int rating) {
		hotel = new Hotel();
		hotel.setHotelName(hotelName);
		hotel.setRating(rating);
		hotelList.add(hotel);
	}

	public int getHotelListSize() {
		return hotelList.size();
	}

	public void printHotelList() {
		System.out.println(hotelList);
	}

	public ArrayList<Hotel> getHotelList() {
		return hotelList;
	}
}
