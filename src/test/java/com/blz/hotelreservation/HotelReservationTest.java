package com.blz.hotelreservation;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	HotelReservation hotelReservation = new HotelReservation();

	@Test
	public void givenHotelList_WhenAdded_shouldReturnProperHotelName() {
		hotelReservation.addHotel("Bridgewood", 4);
		String hotelName = hotelReservation.getHotelList().get(0).getHotelName();
		Assert.assertEquals("Bridgewood", hotelName);
	}

	@Test
	public void givenHotelList_WhenAdded_shouldReturnProperHotelRating() {
		hotelReservation.addHotel("Bridgewood", 4);
		int hotelRating = hotelReservation.getHotelList().get(0).getRating();
		Assert.assertEquals(4, hotelRating);
	}
}