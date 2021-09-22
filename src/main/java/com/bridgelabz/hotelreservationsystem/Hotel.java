package com.bridgelabz.hotelreservationsystem;

public class Hotel {
    String hotelName;
    String hotelNumber;
    int weekDayRates;
    int weekendDayRates;

    public Hotel() {
    }

    public Hotel(String hotelName, String hotelNumber, int weekDayRates, int weekendDayRates) {
        this.hotelName = hotelName;
        this.hotelNumber = hotelNumber;
        this.weekDayRates = weekDayRates;
        this.weekendDayRates = weekendDayRates;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelNumber() {
        return hotelNumber;
    }

    public void setHotelNumber(String hotelNumber) {
        this.hotelNumber = hotelNumber;
    }

    public int getWeekDayRates() {
        return weekDayRates;
    }

    public void setWeekDayRates(int weekDayRates) {
        this.weekDayRates = weekDayRates;
    }

    public int getWeekendDayRates() {
        return weekendDayRates;
    }

    public void setWeekendDayRates(int weekendDayRates) {
        this.weekendDayRates = weekendDayRates;
    }
}
