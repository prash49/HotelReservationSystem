package com.bridgelabz.hotelreservationsystem;

public class Hotel {
    private String hotelName;
    private long weekDayRegularCustomerRate;
    private long weekendDayRegularCustomerRate;

    public Hotel() {

    }

    public Hotel(String hotelName, long weekDayRegularCustomerRate, long weekendDayRegularCustomerRate) {
        this.hotelName = hotelName;
        this.weekDayRegularCustomerRate = weekDayRegularCustomerRate;
        this.weekendDayRegularCustomerRate = weekendDayRegularCustomerRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public long getWeekDayRegularCustomerRate() {
        return weekDayRegularCustomerRate;
    }

    public void setWeekDayRegularCustomerRate(long weekDayRegularCustomerRate) {
        this.weekDayRegularCustomerRate = weekDayRegularCustomerRate;
    }

    public long getWeekendDayRegularCustomerRate() {
        return weekendDayRegularCustomerRate;
    }

    public void setWeekendDayRegularCustomerRate(long weekendDayRegularCustomerRate) {
        this.weekendDayRegularCustomerRate = weekendDayRegularCustomerRate;
    }
}
