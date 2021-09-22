package com.bridgelabz.hotelreservationsystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class HotelReservation implements HotelReservationIF {

    ArrayList<Hotel> hotelList = new ArrayList<Hotel>();
    Hotel hotel;

    public void addHotel(String hotelName, long regularCustomerRate) {

        hotel = new Hotel();
        hotel.setHotelName(hotelName);
        hotel.setRegularCustomerCost(regularCustomerRate);

        hotelList.add(hotel);
        System.out.println("Successfully ADDED !!");
    }

    public int getHotelListSize() {
        return hotelList.size();
    }

    public void printHotelList() {
        for (Hotel list : hotelList) {
            System.out.println("\tHotel Details: " + list.getHotelName()
                    + "\t\tRates per regular Customer: " + list.getRegularCustomerCost() + "$");
        }
    }

    public ArrayList<Hotel> getHotelList() {
        return hotelList;
    }

    public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {

        long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate);
        Optional<Hotel> sortedHotelList = hotelList.stream().min(Comparator.comparing(Hotel::getRegularCustomerCost));
        return sortedHotelList.get();
    }
}

