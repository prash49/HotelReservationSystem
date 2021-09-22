package com.bridgelabz.hotelreservationsystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservation implements HotelReservationIF {

    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    Hotel hotel;

    public void addHotel(String hotelName, long weekDayRegularCustomerRate, long weekendDayRegularCustomerRate, int rating) {
        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setWeekDayRegularCustomerRate(weekDayRegularCustomerRate);
        hotel.setWeekendDayRegularCustomerRate(weekendDayRegularCustomerRate);
        hotel.setRating(rating);
        hotelList.add(hotel);
        System.out.println("Successfully ADDED !!");
    }

    public int getHotelListSize() {
        return hotelList.size();
    }

    public void printHotelList() {
        for (Hotel list : hotelList) {
            System.out.println("\tHotel Details: " + list.getHotelName() + ("  " + list.getRating() + "*'s")
                    + "\t\tRates per regular Customer: " + "Week day Rate:" + list.getWeekDayRegularCustomerRate() + "$"
                    + "Weekend day Rate:" + list.getWeekendDayRegularCustomerRate() + "$");
        }
    }

    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public Hotel getCheapestHotelOnWeekDay(LocalDate startDate, LocalDate endDate) {
        long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        Optional<Hotel> sortedHotelList = hotelList.stream().min(Comparator.comparing(Hotel::getWeekDayRegularCustomerRate));
        return sortedHotelList.get();
    }

    public Hotel getCheapestHotelOnWeekEndDay(LocalDate startDate, LocalDate endDate) {
        long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        Optional<Hotel> sortedHotelList = hotelList.stream().min(Comparator.comparing(Hotel::getWeekendDayRegularCustomerRate));
        return sortedHotelList.get();
    }
}

