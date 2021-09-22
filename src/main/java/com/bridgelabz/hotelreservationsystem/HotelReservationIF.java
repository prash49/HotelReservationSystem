package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

interface HotelReservationIF {

    public void addHotel(String hotelName, long weekDayRegularCustomerRate, long weekendDayRegularCustomerRate, int rating);

    public int getHotelListSize();

    public void printHotelList();

    public ArrayList<Hotel> getHotelList();
}
