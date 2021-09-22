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
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        LocalDate endDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
        Hotel hotelonWeekDays = hotelReservation.getCheapestHotelOnWeekDay(startDate, endDate);
        Assert.assertEquals("Lakewood", hotelonWeekDays.getHotelName());
        System.out.println("Cheapest Hotel on weekdays :" + hotelonWeekDays.getHotelName());
        Assert.assertEquals(110, hotelonWeekDays.getWeekDayRegularCustomerRate());
        System.out.println("Rate for regular customer=" + hotelonWeekDays.getWeekDayRegularCustomerRate() + "$");
        startDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        endDate = LocalDate.of(2020, Month.SEPTEMBER, 12);
        Hotel hotelonWeekEndDays = hotelReservation.getCheapestHotelOnWeekEndDay(startDate, endDate);
        Assert.assertEquals("Bridgewood", hotelonWeekEndDays.getHotelName());
        Assert.assertEquals(50, hotelonWeekEndDays.getWeekendDayRegularCustomerRate());
        System.out.println(" Cheapest hotel On weekend days -> Hotel name:" + hotelonWeekEndDays.getHotelName());
        System.out.println("Rate for Regular customer: " + hotelonWeekEndDays.getWeekendDayRegularCustomerRate() + "$");
        System.out.println("\n\n");
        System.out.println("======= cheap Hotels on Given Dates =========");
        System.out.println("\ton Weekdays -> Hotel Name : " + hotelonWeekDays.getHotelName() + "\t Price :" + hotelonWeekDays.getWeekDayRegularCustomerRate() + "$");
        System.out.println("\t On Weekend days -> Hotel Name: " + hotelonWeekEndDays.getHotelName() + "\t Price: " + hotelonWeekEndDays.getWeekendDayRegularCustomerRate() + "$");
        System.out.println("\t\tTotal Price: " + (hotelonWeekDays.getWeekDayRegularCustomerRate() + hotelonWeekEndDays.getWeekendDayRegularCustomerRate()) + "$");
    }
}
