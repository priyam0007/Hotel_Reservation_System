package com.blz.hotelreservation;

public class HotelReservationMain {
	public static void main(String[] args) {

		System.out.println(" Welcome To Hotel Reservation");
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotel("Lakewood", 3);
		hotelReservation.addHotel("Bridgewood", 4);
		hotelReservation.addHotel("Ridgewood", 5);
		hotelReservation.printHotelList();
	}
}
