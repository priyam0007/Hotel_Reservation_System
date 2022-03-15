package com.blz.hotelreservation;
/*
 * A hotel chain operating in Miami wishes to offer room reservation services over the internet. They
 * have three hotels in Miami: Lakewood, Bridgewood and Ridgewood. Each hotel has separate
 * weekday and weekend (Saturday and Sunday) rates. There are special rates for rewards customer
 * as a part of loyalty program. Each hotel has a rating assigned to it.
 */

/* @purpose: UC1
 * Ability to add Hotel in a Hotel Reservation System with Name and rates for Regular Customer...
 */

public class Hotel {
	private String hotelName;
	private int rating;

	/*
	 * default constructor
	 */
	public Hotel() {

	}

	/*
	 * parameterized constructor
	 */
	public Hotel(String hotelName, int rating) {
		this.hotelName = hotelName;
		this.rating = rating;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + "]";

	}
}
