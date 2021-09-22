package com.bridgelabz.hotelreservationsystem;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class HotelReservationSystemTest {
    @Test
    public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShouldReturnTrue() {
        HotelReservation hotelReservation = new HotelReservation();
        boolean isValidHotel1 = hotelReservation.addHotel("Hotel_1", "Lakewood", 110, 90);
        Assert.assertEquals(true, isValidHotel1);
        boolean isValidHotel2 = hotelReservation.addHotel("Hotel_2", "Bridgewood", 160, 60);
        Assert.assertEquals(true, isValidHotel2);
        boolean isValidHotel3 = hotelReservation.addHotel("Hotel_3", "Ridgewood", 220, 150);
        Assert.assertEquals(true, isValidHotel3);
        hotelReservation.displayHotels();
    }
}
