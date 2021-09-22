package com.bridgelabz.hotelreservationsystem;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

/**
 * Unit test for simple App.
 */
public class HotelReservationSystemTest {
    @Test
    public void givenHotelDetails_WhenValuesEnteredAreCorrect_ShouldReturnTrue() {
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 110, 90);
        hotelReservation.addHotel("Bridgewood", 150, 50);
        hotelReservation.addHotel("Ridgewood", 220, 150);
        int hotelListSize = hotelReservation.getHotelListSize();
        hotelReservation.printHotelList();
        Assert.assertEquals(3, hotelListSize);
    }

    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelName() {
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 150, 50);
        String hotelName = hotelReservation.getHotelList().get(0).getHotelName();
        Assert.assertEquals("Bridgewood", hotelName);
        System.out.println(hotelName);
    }


    @Test
    public void givenHotelList_WhenAdded_shouldReturnProperHotelRegularCustomerCost() {
        HotelReservationIF hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Bridgewood", 150, 50);
        int hotelRegularCustomerCost = (int) hotelReservation.getHotelList().get(0).getWeekDayRegularCustomerRate();
        Assert.assertEquals(150, hotelRegularCustomerCost);
        System.out.println(hotelRegularCustomerCost);
    }

    @Test
    public void givenHotelDetails_shouldReturnCheapestHotel() {

        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel("Lakewood", 110, 90);
        hotelReservation.addHotel("Bridgewood", 150, 50);
        hotelReservation.addHotel("RidgeWood", 220, 150);
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        Hotel hotel = hotelReservation.getCheapestHotel(startDate, endDate);
        Assert.assertEquals("Lakewood", hotel.getHotelName());
        System.out.println("CheapestHotel:" + hotel.getHotelName());
        Assert.assertEquals(110, hotel.getWeekDayRegularCustomerRate());
        System.out.println("Rate for regular customer=" + hotel.getWeekDayRegularCustomerRate() + "$");
    }
}
