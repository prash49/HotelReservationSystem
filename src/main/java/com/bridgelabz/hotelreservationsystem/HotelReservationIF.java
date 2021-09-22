package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

interface HotelReservationIF {

    public void addHotel(String hotelName, int rating, long regularCustomerRate);

    public int getHotelListSize();

    public void printHotelList();

    public ArrayList<Hotel> getHotelList();
}
